package com.misionticmanu.Account_ms_M.controllers;


import com.misionticmanu.Account_ms_M.exceptions.NotAvailableProductException;
import com.misionticmanu.Account_ms_M.models.Sells;
import com.misionticmanu.Account_ms_M.repositories.SellsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class SellsController {

    private final SellsRepository sellsRepository;

    public SellsController(SellsRepository sellsRepository){
        this.sellsRepository = sellsRepository;
    }

    @PostMapping("/Sells")
    Sells NewSells(@RequestBody Sells sells){ return sellsRepository.save(sells);

    }

    @GetMapping("/Sells/{username}")
    Sells getSells(@PathVariable String username ){
        return sellsRepository.findById(username).orElseThrow(() -> new NotAvailableProductException("No se encontro una cuenta con el username: " + username));
    }




}

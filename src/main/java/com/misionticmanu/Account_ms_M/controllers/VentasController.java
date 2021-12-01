package com.misionticmanu.Account_ms_M.controllers;


import com.misionticmanu.Account_ms_M.models.Ventas;
import com.misionticmanu.Account_ms_M.repositories.VentasRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class VentasController {

    private final VentasRepository ventasRepository;

    public VentasController(VentasRepository ventasRepository){
        this.ventasRepository = ventasRepository;
    }

    @PostMapping("/ventas")
    Ventas newVentas(@RequestBody Ventas ventas){
    Ventas ventasId_product =
ventasRepository.findById_product(ventas.getId_product()).orElse(null);
    Ventas ventasAmount =
ventasRepository.findByAmount(ventas.getAmount()).orElse(null);

    ventasId_product.setAmount(ventasId_product.getAmount() -);



    }




}

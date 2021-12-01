package com.misionticmanu.Account_ms_M.repositories;

import com.misionticmanu.Account_ms_M.models.Ventas;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface VentasRepository extends MongoRepository<Ventas, String>{
    List<Ventas> findById_product (String id_product);
    List<Ventas> findByAmount (Integer amount);
}

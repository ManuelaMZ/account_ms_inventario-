package com.misionticmanu.Account_ms_M.repositories;

import com.misionticmanu.Account_ms_M.models.Sells;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SellsRepository extends MongoRepository<Sells, String>{

}

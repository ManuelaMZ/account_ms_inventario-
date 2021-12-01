package com.misionticmanu.Account_ms_M.repositories;

import com.misionticmanu.Account_ms_M.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository <Account, String> { }


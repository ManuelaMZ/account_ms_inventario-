package com.misionticmanu.Account_ms_M.repositories;

import com.misionticmanu.Account_ms_M.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByUsernameOrigin (String usernameOrigin);
    List<Transaction> findByUsernameDestiny (String usernameDestiny);
}
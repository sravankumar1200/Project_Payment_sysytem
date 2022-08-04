package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Model.TransactionTBL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionTBL,Long> {


}

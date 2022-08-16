package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Model.TransactionTBL;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionTBL,String> {
    //@Modifying
    //@Query(value = "SELECT * FROM TRANSACTIONS  WHERE TRANSACTIONS.reciver_ac_name =:reciver_ac_name",nativeQuery = true)
    //TransactionTBL  findybyName (String reciver_ac_name );


}

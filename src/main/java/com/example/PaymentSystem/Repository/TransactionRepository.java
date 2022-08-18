package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Model.TransactionTBL;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionTBL,String> {
    @Modifying
    @Query(value = "SELECT messagecode,count(messagecode) FROM TRANSACTIONS GROUP BY(messagecode)",nativeQuery = true)
    //TransactionTBL  findybyName (String reciver_ac_name );
    List<Object> getmessagecode();

    @Modifying
    @Query(value = "SELECT transfertypecode,count(transfertypecode) FROM TRANSACTIONS GROUP BY(transfertypecode)",nativeQuery = true)
    List<Object>gettransfercode();


}

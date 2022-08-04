
package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Model.TransactionTBL;

import java.util.List;

public interface TransactionServices {

    public TransactionTBL SaveTransaction(TransactionDTO transactionDTO);
   public List<TransactionTBL> Getall();
}




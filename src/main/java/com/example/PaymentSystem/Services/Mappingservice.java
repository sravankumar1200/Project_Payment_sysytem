/*
package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.Bank;
import com.example.PaymentSystem.Model.Customer;
import com.example.PaymentSystem.Model.Transaction;
import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Repository.BankRepository;
import com.example.PaymentSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

public class Mappingservice {
    @Autowired
    CustomerRepository customerRepository;
    BankRepository bankRepository;
    //private Bank bank;
    private Transaction transaction;
   // private Transac

    private  TransactionDTO convertDataIntoDTO() {
        TransactionDTO dto =new TransactionDTO();
        Customer c = customerRepository.findById(dto.getCustid()).get();
        Bank b= bankRepository.findById(dto.getBic()).get();


       //bankRepository.findById(dto.getBic());
        //transaction.set(dto.getCustid());
        transaction.setCustomer(c);
        transaction.setBank(b);
        if(dto.getAmount()<c.getClr_balance()){
           // dto.setAmount(c.getClr_balance()-dto.getAmount());;
            c.setClr_balance(c.getClr_balance()-dto.getAmount());

        }
        if(dto.getAmount()>c.getClr_balance() && c.getOd()=="yes" ){
            c.setClr_balance(c.getClr_balance()-dto.getAmount());
        }
        else{
            c.setClr_balance(dto.getAmount());
        }





      //  dto.setBic(bank.getBic());
       // dto.setAmount( dto.getAmount()-customer.getClr_balance());

        return dto;
    }
}


 */
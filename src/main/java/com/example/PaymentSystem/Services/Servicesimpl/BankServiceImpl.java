package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.Bank;
import com.example.PaymentSystem.Repository.BankRepository;
import com.example.PaymentSystem.Services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankServices {
    @Autowired
    private BankRepository bankRepository;


    @Override
    public Bank SaveBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public Bank getbyID(Long id) {
        return(bankRepository.findById(id).orElseThrow(()->new RuntimeException("not found")));
        }

    }


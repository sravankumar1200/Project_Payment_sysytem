package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.Bank;

public interface BankServices {
    public Bank SaveBank(Bank bank);
    public Bank getbyID(String id);


}


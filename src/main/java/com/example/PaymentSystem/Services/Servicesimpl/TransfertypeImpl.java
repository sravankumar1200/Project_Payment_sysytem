package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.Transfertype;
import com.example.PaymentSystem.Repository.TransfertypeRepository;
import com.example.PaymentSystem.Services.TransfertypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransfertypeImpl  implements TransfertypeServices {
    @Autowired
    private TransfertypeRepository transfertypeRepository;

    @Override
    public Transfertype saveTransfertype(Transfertype transfertype) {
        return  transfertypeRepository.save(transfertype);
    }
}

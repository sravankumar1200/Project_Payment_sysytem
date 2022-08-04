package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.TransactionTBL;
import com.example.PaymentSystem.Model.Transfertype;
import com.example.PaymentSystem.Services.TransfertypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TransfertypeController {
    @Autowired
    private TransfertypeServices transfertypeServices;

    @PostMapping("/add")
    public ResponseEntity<String> saveTransfer( @RequestBody Transfertype transfertype){
        transfertypeServices.saveTransfertype(transfertype);
        return(ResponseEntity.status(HttpStatus.OK).body("OK"));
    }




}

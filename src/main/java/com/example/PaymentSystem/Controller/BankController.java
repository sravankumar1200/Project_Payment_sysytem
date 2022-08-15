package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.Bank;
import com.example.PaymentSystem.Repository.BankRepository;
import com.example.PaymentSystem.Services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
  @Autowired
  private BankServices bankServices;
  //private BankRepository bankRepository;


    @PostMapping("/save")
    public ResponseEntity<String> saveBank(@RequestBody Bank bank){
        bankServices.SaveBank(bank);
        return(ResponseEntity.status(HttpStatus.OK).body("OK"));
    }
    @GetMapping("/show")
    public Bank getbank(@RequestParam(name = "id")String id){
        return(bankServices.getbyID(id));
    }
    


}

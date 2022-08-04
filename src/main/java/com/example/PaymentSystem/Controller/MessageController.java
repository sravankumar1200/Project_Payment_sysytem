package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.Message;
import com.example.PaymentSystem.Model.Transfertype;
import com.example.PaymentSystem.Services.Messageservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MessageController {
    @Autowired
    private Messageservices messageservices;
    @PostMapping("/save")
    public ResponseEntity<String> saveTransfertype(@RequestBody Message message){

        messageservices.saveMessage(message);
        return(ResponseEntity.status(HttpStatus.OK).body("OK"));
    }

}

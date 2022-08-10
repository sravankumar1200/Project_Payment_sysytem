package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.User;
import com.example.PaymentSystem.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserContoller {
    @Autowired
    private Userservice userservice;
    @PostMapping("/save")
    public ResponseEntity<String>saveuser(@RequestBody User user){
        userservice.SaveUser(user);
        return(ResponseEntity.status(HttpStatus.OK).body("OK"));
    }
}

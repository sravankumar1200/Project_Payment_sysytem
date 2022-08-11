package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.JwtUtil;
import com.example.PaymentSystem.Model.User;
import com.example.PaymentSystem.Model.UserResponse;
import com.example.PaymentSystem.Model.Userrequest;
import com.example.PaymentSystem.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class UserContoller {
    @Autowired
    private Userservice userservice;
    @Autowired
    private JwtUtil util;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/user/save")
    public ResponseEntity<String>saveuser(@RequestBody User user){
        userservice.SaveUser(user);
        return(ResponseEntity.status(HttpStatus.OK).body("OK"));
    }
    /*
    @PostMapping("/login")
    public ResponseEntity<UserResponse>loginuser(@RequestBody Userrequest req){
        String token =util.generateToken(req.getUsername());
        return (ResponseEntity.ok(new UserResponse(token,"success")));
    }

     */
    @PostMapping("/user/login")
    public ResponseEntity<UserResponse> loginUser(@RequestBody Userrequest userRequest)
    {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        userRequest.getUsername(),
                        userRequest.getPwd()
                )
        );
        String token=util.generateToken(userRequest.getUsername());
        return ResponseEntity.ok(new UserResponse(token,"good "));
    }
}

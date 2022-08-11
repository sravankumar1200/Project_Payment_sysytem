package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.User;

import java.util.Optional;

public interface  Userservice {
    public User SaveUser(User user) ;
    public Optional<User> findByUsername(String username);


}

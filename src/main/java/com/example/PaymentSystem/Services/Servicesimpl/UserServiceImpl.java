package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.User;
import com.example.PaymentSystem.Repository.UserRepository;
import com.example.PaymentSystem.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User SaveUser(User user) {
        return userRepository.save(user);
    }
}

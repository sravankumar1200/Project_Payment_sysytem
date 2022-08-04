package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.Message;
import com.example.PaymentSystem.Repository.MessageRepository;
import com.example.PaymentSystem.Services.Messageservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl  implements Messageservices {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message saveMessage(Message message) {

        return messageRepository.save(message);

    }
}

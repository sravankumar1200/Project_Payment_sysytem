package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MessageRepository  extends JpaRepository<Message,String> {

}

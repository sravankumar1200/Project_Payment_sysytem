package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}

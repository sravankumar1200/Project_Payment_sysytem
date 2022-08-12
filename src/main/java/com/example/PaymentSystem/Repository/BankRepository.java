package com.example.PaymentSystem.Repository;

import com.example.PaymentSystem.Model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,String> {
}

package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.Customer;

import java.util.List;

public interface Customerservices {
  public Customer saveCustomer(Customer customer);
  public Customer getCustomerbyId(String id);
  public List<Customer> getall();

}

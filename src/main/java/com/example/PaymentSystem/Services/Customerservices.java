package com.example.PaymentSystem.Services;

import com.example.PaymentSystem.Model.Customer;

public interface Customerservices {
  public Customer saveCustomer(Customer customer);
  public Customer getCustomerbyId(Long id);

}

package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.Customer;
import com.example.PaymentSystem.Repository.CustomerRepository;
import com.example.PaymentSystem.Services.Customerservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements Customerservices {
    @Autowired
    private CustomerRepository customerRepository;



    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerbyId(Long id) {
        return(customerRepository.findById(id).orElseThrow(()->new RuntimeException("not found")));
    }
}

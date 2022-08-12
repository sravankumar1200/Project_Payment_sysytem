package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.Customer;
import com.example.PaymentSystem.Services.Customerservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private Customerservices customerservices;
    /*public CustomerController(Customerservices customerservices) {
        super();
        this.customerservices = customerservices;
    }

     */
    @PostMapping("/save")
    public String saveCustomer(@RequestBody Customer customer){
        customerservices.saveCustomer(customer);
        return("done");
    }
    @GetMapping("/getbyId")
    public Customer get(@RequestParam(name = "id") String id){
        return customerservices.getCustomerbyId(id);

    }
    @GetMapping("/getall")
    public List<Customer> show(){
        return customerservices.getall();
    }




}

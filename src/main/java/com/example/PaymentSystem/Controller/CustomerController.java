package com.example.PaymentSystem.Controller;

import com.example.PaymentSystem.Model.Customer;
import com.example.PaymentSystem.Services.Customerservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hi")
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
    public Customer get(@RequestParam(name = "id") Long id){
        return customerservices.getCustomerbyId(id);

    }




}

package com.example.PaymentSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public  class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long CustID;

    private String ac_name;

    private Double clr_balance;
    private String od;


    //private Transaction transactionid;


}
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
    private  String custid;

    private String accountholdername;
    private String customeraddress;
    private String customercity;

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    private String customertype;
    private Double clearbalance;


    public String getAccountholdername() {
        return accountholdername;
    }

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    public Double getClearbalance() {
        return clearbalance;
    }

    public void setClearbalance(Double clearbalance) {
        this.clearbalance = clearbalance;
    }

    public String getOverdraftflag() {
        return overdraftflag;
    }

    public void setOverdraftflag(String overdraftflag) {
        this.overdraftflag = overdraftflag;
    }

    private String overdraftflag;


    //private Transaction transactionid;


}
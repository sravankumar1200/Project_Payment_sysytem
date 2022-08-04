package com.example.PaymentSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Data
@Table(name="Transactions")
public class TransactionTBL {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionid;
    private String reciver_ac_name;
    private Long reciver_ac_no;
    private double amount;
    private Date transferdate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="custid", referencedColumnName = "custid" )
    private Customer customer;
    @ManyToOne()
    @JoinColumn(name="bic", referencedColumnName = "bic")
    private  Bank bank;
    @ManyToOne()
    @JoinColumn(name="messagecode", referencedColumnName = "messagecode")
    private Message message;
    @ManyToOne()
    @JoinColumn(name="transfertypecode", referencedColumnName = "transfertypecode")
    private Transfertype transfertype;


}



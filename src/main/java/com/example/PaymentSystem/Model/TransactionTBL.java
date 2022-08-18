package com.example.PaymentSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
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




    public String getReciver_ac_name() {
        return reciver_ac_name;
    }

    public void setReciver_ac_name(String reciver_ac_name) {
        this.reciver_ac_name = reciver_ac_name;
    }

    public Long getReciver_ac_no() {
        return reciver_ac_no;
    }

    public void setReciver_ac_no(Long reciver_ac_no) {
        this.reciver_ac_no = reciver_ac_no;
    }
}



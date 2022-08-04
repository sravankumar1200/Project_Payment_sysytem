package com.example.PaymentSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name = "bankdetails")
public class Bank {

    private static Long gen(){
        return (  (long) (Math.random()*Math.pow(10,10)));
    }
    @Id
    private Long bic=Bank.gen();
    private String bankname;

    public Long getBic() {
        return bic;
    }

    public void setBic(Long bic) {
        this.bic = Bank.gen();
    }
}
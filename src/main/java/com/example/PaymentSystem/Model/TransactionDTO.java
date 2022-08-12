package com.example.PaymentSystem.Model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
//@Entity
public class TransactionDTO {
   // @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private String custid;
    //@Transient
    private String bic;
    //@Transient
    private Double amount;


}



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
    private Long custid;
    //@Transient
    private Long bic;
    //@Transient
    private Double amount;


}



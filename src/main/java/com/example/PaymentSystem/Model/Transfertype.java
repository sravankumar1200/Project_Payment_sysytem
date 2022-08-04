package com.example.PaymentSystem.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name="Transfertypes")
public class Transfertype {
    @Id

    private String transfertypecode;
    private String transfertypedes;



}

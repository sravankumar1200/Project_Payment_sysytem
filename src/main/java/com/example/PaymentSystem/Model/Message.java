package com.example.PaymentSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Data
public class Message {
    @Id
    private String messagecode;
    private String instruction;




}

package com.example.PaymentSystem.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private  String pwd;
    @ElementCollection
    @CollectionTable(name = "rolestab", joinColumns = @JoinColumn(
            name = "id")
    )
    @Column(name = "role")
    private Set<String>roles;
}

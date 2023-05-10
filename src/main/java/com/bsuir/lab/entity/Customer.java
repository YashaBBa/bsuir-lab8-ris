package com.bsuir.lab.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String surname;

    @Column(name = "address")
    private String address;
    @Column(name = "budget")
    private Integer budget;
    @Column(name = "email")
    String email;
}

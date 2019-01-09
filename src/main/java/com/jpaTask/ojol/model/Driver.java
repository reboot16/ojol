package com.jpaTask.ojol.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "DRIVER")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE")
    private String phone;
}

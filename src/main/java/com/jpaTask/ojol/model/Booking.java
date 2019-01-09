package com.jpaTask.ojol.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "NAMA")
    private String nama;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id",referencedColumnName = "id")
    private Driver driver;

    @Column(name = "TIME")
    private Date Time;

    @Column(name = "DESTINATION")
    private String destination;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id",referencedColumnName = "id")
    private Account account;

    @Column(name = "STATUS")
    private String status;

}

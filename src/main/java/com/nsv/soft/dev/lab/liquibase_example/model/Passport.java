package com.nsv.soft.dev.lab.liquibase_example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "passports")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "number")
    String number;

    @OneToOne(mappedBy = "passport")
    User user;
}

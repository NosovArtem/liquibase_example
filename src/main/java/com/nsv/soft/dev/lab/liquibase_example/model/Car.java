package com.nsv.soft.dev.lab.liquibase_example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "model")
    String model;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}

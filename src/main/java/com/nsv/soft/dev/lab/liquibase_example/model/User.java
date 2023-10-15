package com.nsv.soft.dev.lab.liquibase_example.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "last_name")
    String lastName;

    @OneToMany(mappedBy = "user")
    List<Car> carList;

    @OneToOne
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    Passport passport;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    Group group;


}

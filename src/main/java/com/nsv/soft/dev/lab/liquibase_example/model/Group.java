package com.nsv.soft.dev.lab.liquibase_example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "group_name")
    String groupName;

    @OneToMany(mappedBy = "group")
    List<User> user;
}

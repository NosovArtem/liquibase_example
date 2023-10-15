package com.nsv.soft.dev.lab.liquibase_example.service;

import com.nsv.soft.dev.lab.liquibase_example.model.User;
import com.nsv.soft.dev.lab.liquibase_example.model.repository.CarJpaRepository;
import com.nsv.soft.dev.lab.liquibase_example.model.repository.GroupJpaRepository;
import com.nsv.soft.dev.lab.liquibase_example.model.repository.PassportJpaRepository;
import com.nsv.soft.dev.lab.liquibase_example.model.repository.PersonJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyService {

    private final CarJpaRepository carJpaRepository;
    private final PersonJpaRepository personJpaRepository;
    private final PassportJpaRepository passportJpaRepository;
    private final GroupJpaRepository groupJpaRepository;

    public MyService(CarJpaRepository carJpaRepository, PersonJpaRepository personJpaRepository, PassportJpaRepository passportJpaRepository, GroupJpaRepository groupJpaRepository) {
        this.carJpaRepository = carJpaRepository;
        this.personJpaRepository = personJpaRepository;
        this.passportJpaRepository = passportJpaRepository;
        this.groupJpaRepository = groupJpaRepository;
    }

    public Optional<User> getUsr(Long id) {
        Optional<User> byId = personJpaRepository.findById(id);
        System.out.println();
        return byId;
    }
}

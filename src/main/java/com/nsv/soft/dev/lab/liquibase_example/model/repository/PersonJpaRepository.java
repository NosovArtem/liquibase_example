package com.nsv.soft.dev.lab.liquibase_example.model.repository;

import com.nsv.soft.dev.lab.liquibase_example.model.User;
import org.springframework.data.repository.CrudRepository;

public interface PersonJpaRepository extends CrudRepository<User, Long> {
}

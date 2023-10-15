package com.nsv.soft.dev.lab.liquibase_example.model.repository;

import com.nsv.soft.dev.lab.liquibase_example.model.Passport;
import org.springframework.data.repository.CrudRepository;

public interface PassportJpaRepository extends CrudRepository<Passport, Long> {
}

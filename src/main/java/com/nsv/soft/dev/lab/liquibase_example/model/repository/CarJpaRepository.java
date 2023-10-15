package com.nsv.soft.dev.lab.liquibase_example.model.repository;

import com.nsv.soft.dev.lab.liquibase_example.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarJpaRepository extends CrudRepository<Car, Long> {
}

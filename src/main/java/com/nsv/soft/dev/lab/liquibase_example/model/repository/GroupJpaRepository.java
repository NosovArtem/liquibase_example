package com.nsv.soft.dev.lab.liquibase_example.model.repository;

import com.nsv.soft.dev.lab.liquibase_example.model.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupJpaRepository extends CrudRepository<Group, Long> {
}

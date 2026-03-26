package com.homework.project.repo;

import com.homework.project.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {
}
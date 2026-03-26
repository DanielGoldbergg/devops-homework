package com.homework.project.service;

import com.homework.project.model.Employees;
import com.homework.project.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Iterable<Employees> getAll() {
        return repository.findAll();
    }

    public Optional<Employees> findById(Long id) {
        return repository.findById(id);
    }

    public Employees save(Employees employee) {
        return repository.save(employee);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
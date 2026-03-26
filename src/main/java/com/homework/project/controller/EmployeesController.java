package com.homework.project.controller;

import com.homework.project.model.Employees;
import com.homework.project.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // GET all employees from the database
    @GetMapping
    public Iterable<Employees> getAll() {
        return employeeRepository.findAll();
    }

    // POST a new employee (Validates via setters in the Model)
    @PostMapping
    public Employees addEmployee(@RequestBody Employees employee) {
        return employeeRepository.save(employee);
    }

    // DELETE by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
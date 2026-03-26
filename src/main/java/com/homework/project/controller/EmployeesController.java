package com.homework.project.controller;

import com.homework.project.model.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private List<Employees> employeeList = new ArrayList<>();


    @GetMapping
    public List<Employees> getAll() {
        return employeeList;
    }

    @PostMapping
    public Employees addEmployee(@RequestBody Employees employee) {
        employee.setId((long) (employeeList.size() + 1));
        employeeList.add(employee);
        return employee;
    }
}
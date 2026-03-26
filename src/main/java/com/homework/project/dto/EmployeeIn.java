package com.homework.project.dto;

import com.homework.project.model.Employees;

import jakarta.validation.constraints.*;
import java.io.Serializable;

import jakarta.validation.constraints.*;


public class EmployeeIn implements Serializable {

    @NotBlank
    @Size(min = 5, max = 30)
    private String fullName;

    @Min(18) @Max(120)
    private Integer age;

    @Min(0)
    private Double yearsOfService;

    @Min(0)
    private Double wage;

    public EmployeeIn() {}


    public Employees toEmployee() {
        Employees employee = new Employees();
        updateEmployee(employee);
        return employee;
    }

    public void updateEmployee(Employees employee) {
        employee.setFullName(this.fullName);
        employee.setAge(this.age);
        employee.setYearsOfService(this.yearsOfService);
        employee.setWage(this.wage);
    }

    // --- Manual Getters and Setters ---

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(Double yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }
}
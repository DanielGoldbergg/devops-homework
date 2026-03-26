package com.homework.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private int age;
    private double yearsOfService;
    private double wage;

    public Employees() {}

    public Employees(Long id, String fullName, int age, double yearsOfService, double wage) {
        this.id = id;
        setFullName(fullName);
        setAge(age);
        setYearsOfService(yearsOfService);
        setWage(wage);
    }

    // --- Validation logic remains in setters ---
    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) throw new IllegalArgumentException("Name required");
        this.fullName = fullName;
    }

    public void setAge(int age) {
        if (age < 18 || age > 120) throw new IllegalArgumentException("Invalid age (18-120)");
        this.age = age;
    }

    public void setYearsOfService(double yearsOfService) {
        if (yearsOfService < 0) throw new IllegalArgumentException("Cannot be negative");
        this.yearsOfService = yearsOfService;
    }

    public void setWage(double wage) {
        if (wage < 0) throw new IllegalArgumentException("Wage cannot be negative");
        this.wage = wage;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public double getYearsOfService() { return yearsOfService; }
    public double getWage() { return wage; }
}
package com.homework.project.model;

public class Employees {

    private Long id;
    private String fullName;
    private int age;
    private double yearsOfService;
    private double wage;

    public Employees() {}

    public Employees(Long id, String fullName, int age, double yearsOfService, double wage) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.yearsOfService = yearsOfService;
        this.wage = wage;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getYearsOfService() { return yearsOfService; }
    public void setYearsOfService(double yearsOfService) { this.yearsOfService = yearsOfService; }

    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }
}
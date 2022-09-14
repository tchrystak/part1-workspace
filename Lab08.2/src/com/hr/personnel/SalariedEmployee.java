package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  // field methods
  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  // TODO: 9/13/2022 Declare and implement a constructor that takes name, HireDate, and salary parameters
  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);
  }

  // TODO: 9/13/2022 Generate setters and getters for rate and hours
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  // TODO: 9/13/2022  Override toString

  @Override
  public String toString() {
    return String.format("%s, salary=%.2f,", super.toString(), getSalary());
  }
}

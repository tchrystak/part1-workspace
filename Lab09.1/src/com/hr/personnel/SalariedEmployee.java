package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {

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

  public void pay() {
    System.out.printf("%s is paid a salary of %,.2f%n", getName(), salary);
//    System.out.println(getName() + " is paid a salary of " + salary);
  }

  @Override
  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), getSalary() * SALARIED_TAX_RATE);
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
//    return super.toString() + ", salary= " + getSalary();
    return String.format("%s, salary= %,.2f,", super.toString(), getSalary());
  }
}

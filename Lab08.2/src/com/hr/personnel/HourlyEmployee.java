package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {


  // field methods
  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  // constructors
  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  // TODO: 9/13/2022 Declare and implement a constructor that takes name, HireDate, , rate, and hours as parameters
  public HourlyEmployee( String name, LocalDate hireDate, double rate, double hours){
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), getHours() * getRate());
  }

  //  setters and getters
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  // TODO: 9/13/2022  Override toString

  @Override
  public String toString() {
//    return super.toString() + ", rate = " + rate + ", hours = " + hours;
    return String.format("%s, rate= %.2f, hours= %.1f", super.toString(), getRate(), getHours());

    // One of these 2 ways on lines 49 & 50...
    // %f means use a decimal point...float; 2f is 2 digits after the decimal, 1f is 1 digit after the decimal
  }
}

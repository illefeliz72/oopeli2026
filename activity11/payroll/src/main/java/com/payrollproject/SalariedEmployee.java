package com.payrollproject;

public class SalariedEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public SalariedEmployee(String name, String employeeID, double baseSalary, double bonus) {
         super(name, employeeID, EmployeeType.SALARIED);

        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }

    public double calculateEarnings() {
        return baseSalary + bonus;
    }
}

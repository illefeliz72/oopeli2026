package com.payrollproject;

import java.util.Objects;

import com.payrollproject.EmployeeType;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected EmployeeType type;

    public Employee(String name, String employeeId, EmployeeType type) {
        this.name = name;
        this.employeeId = employeeId;
        this.type = type;
    }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return String.format("""
                        name: %s
                        id: %s
                        type: %s
                """, name, employeeId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        
        return Objects.equals(employeeId, employee.employeeId);
    }
}

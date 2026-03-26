package com.payrollproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static final FileHandler fileHandler = new FileHandler();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
           
            System.out.print("Choice: ");
            System.out.println("""
                
                    [1.] Add Employee
                    [2.] View All Employees
                    [3.] Save Records
                    [4.] Load Records
                    [5.] Exit
                    """);
             System.out.print("Choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> fileHandler.saveEmployees(employees);
                case 4 -> employees = fileHandler.loadEmployees();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.println("Select Type: 1. Salaried | 2. Hourly");
        int type = scanner.nextInt();

        if (type == 1) {
            System.out.print("Monthly Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Bonus: ");
            double bonus = scanner.nextDouble();
            employees.add(new SalariedEmployee(name, id, salary, bonus));
        } else if (type == 2) {
            System.out.print("Hours Worked: ");
            int hours = scanner.nextInt();
            System.out.print("Hourly Rate: ");
            double rate = scanner.nextDouble();
            employees.add(new HourlyEmployee(name, id, hours, rate));
        } else {
            System.out.println("Invalid employee type.");
        }
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("The list is currently empty.");
        } else {
            System.out.println("\n--- Current Payroll List ---");
            for (Employee e : employees) {
                System.out.printf("%s | Earnings: $%.2f%n", e.toString(), e.calculateEarnings());
            }
        }
    }
}
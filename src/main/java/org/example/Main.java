package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Healthplan objects
        Healthplan healthplan1 = new Healthplan(1, "Health Plan A", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Health Plan B", Plan.PREMIUM);

        // Employee objects
        String[] healthPlans = new String[3];
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthPlans);

        // Company object
        String[] developers = new String[3];
        Company company = new Company(1, "Tech Corp", 50000, developers);

        // Add healthplans and employees
        employee.addHealthPlan(0, "Health Plan A");
        employee.addHealthPlan(1, "Health Plan B");

        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Smith");

        // Display objects
        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(employee);
        System.out.println(company);
    }
}

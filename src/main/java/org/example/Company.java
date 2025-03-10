package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor
    public Company(int id, String name, double giro, String[] developerNames) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro cannot be negative");
        }
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro cannot be negative");
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // Method for adding an employee
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index.");
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("This index is already filled.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + String.join(", ", developerNames) +
                '}';
    }
}

package com.jbeans;


public class Employee {
    String name;
    double salary;
    String dep;

    public Employee(String name, double salary, String dep) {
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}

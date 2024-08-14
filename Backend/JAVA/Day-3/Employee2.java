package com.sanjay;

class Employees1{
    public void work() {
        System.out.println("Employee is working.");
    }
    public double getSalary() {
        return 50000;
    }
}
class HRManager extends Employees1 {
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Employees1 emp = new Employees1();
        emp.work();
        System.out.println("Employee Salary:" + emp.getSalary());

        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("HR Manager Salary:" + hr.getSalary());
    }
}
package com.sanjay;

class EmployeeDetails {
    String name;
    String jobTitle;
    int salary;
    public EmployeeDetails(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void updateSalary(int newSalary) {
        this.salary = newSalary;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
    }
}
public class Employees {
    public static void main(String[] args) {
    	EmployeeDetails emp = new EmployeeDetails("Sanjay", "FrontEnd Developer", 50000);
        emp.display(); 
        System.out.println("After Salary Update:");
        emp.updateSalary(60000);
        emp.display();
    }
}

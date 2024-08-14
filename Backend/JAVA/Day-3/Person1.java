package com.sanjay;

class Person3 {
	 private String firstName;
	 private String lastName;
	 public Person3(String firstName, String lastName) {
	     this.firstName = firstName;
	     this.lastName = lastName;
	 }
	 public String getFirstName() {
	     return firstName;
	 }
	 public String getLastName() {
	     return lastName;
	 }
	}
	class Employee3 extends Person3 {
	 private String employeeId;
	 private String jobTitle;

	 public Employee3(String firstName, String lastName, String employeeId, String jobTitle) {
	     super(firstName, lastName);
	     this.employeeId = employeeId;
	     this.jobTitle = jobTitle;
	 }
	 public String getEmployeeId() {
	     return employeeId;
	 }
	 public String getLastName() {
	     return super.getLastName() + ", " + jobTitle;
	 }
}
	public class Person1 {
	 public static void main(String[] args) {
	     Employee3 emp = new Employee3("Sanjay", "Kumar", "E123", "Software Engineer");
	     System.out.println("First Name: " + emp.getFirstName());
	     System.out.println("Last Name: " + emp.getLastName());
	     System.out.println("Employee ID: " + emp.getEmployeeId());
	 }
	}
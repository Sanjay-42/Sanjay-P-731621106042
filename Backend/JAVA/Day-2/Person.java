package com.sanjay;

public class Person {
	String Name;
	int Age;
	Person(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	void display() {
		System.out.println("Name:"+Name);
		System.out.println("Age:"+Age);
	}

	public static void main(String []args) {
		Person obj1=new Person("Sanjay",21);
		obj1.display();
		Person obj2=new Person("Praveen",20);
		obj2.display();
	}
}

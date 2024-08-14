package com.sanjay;

class vehicle3{
	void drive() {
		System.out.println("Car is an Vehicle");
	}
}
class Car extends vehicle3{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Vehicles2 {
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
	}
}

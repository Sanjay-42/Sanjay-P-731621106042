package com.sanjay;

public class Circle {
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	void area() {
		float area=3.14f*radius*radius;
		System.out.println("Area of Circle:"+area);
	}
	void circumference() {
		float circumference=2*3.14f*radius;
		System.out.println("Circumference of Circle:"+circumference);

	}
	public static void main(String[] args) {
		Circle obj1=new Circle(4);
		obj1.area();
		Circle obj2=new Circle(4);
		obj2.circumference();
		
	}

}

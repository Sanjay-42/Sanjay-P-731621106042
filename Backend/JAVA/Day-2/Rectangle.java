package com.sanjay;
public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	void area() {
		int area=width*height;
		System.out.println("Area of Rectangle:"+area);
	}
	void perimeter() {
		int perimeter=2*(width+height);
		System.out.println("Perimeter of Rectangle:"+perimeter);
	}
	public static void main(String[] args) {
		Rectangle obj1=new Rectangle(5,4);
		obj1.area();
		Rectangle obj2=new Rectangle(5,4);
		obj2.perimeter();
	}

}

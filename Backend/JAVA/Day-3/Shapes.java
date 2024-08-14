package com.sanjay;

class Shape{
	void getArea() {
		System.out.println("Rectangles");
	}
}
class Rectangles extends Shape{
	void getArea(int width,int height) {
		int area=width*height;
		System.out.println("Area of Rectangle:"+area);
	}
}
public class Shapes {
	public static void main(String []args) {
		Rectangles r=new Rectangles();
		r.getArea(3,5);
		
	}
}

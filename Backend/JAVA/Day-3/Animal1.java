package com.sanjay;

class Animals1{
	void move() {
		System.out.println("Animal");
	}
}
class Cheetah extends Animals1{
	void move(){
		System.out.println("It moves fast");
	}
}
public class Animal1 {
	public static void main(String []args) {
		Cheetah c=new Cheetah();
		c.move();
	}
}

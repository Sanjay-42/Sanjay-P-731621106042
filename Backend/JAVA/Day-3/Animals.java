package com.sanjay;

class Animal{
	void makeSound() {
		System.out.println("Animal make a Sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat Make a sound like Meow");
	}
}
public class Animals {
public static void main(String []args) {
	Cat c=new Cat();
	c.makeSound();
	}
}

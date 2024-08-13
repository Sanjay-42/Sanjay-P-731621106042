package com.sanjay;

public class Dog {
	String  name;
	String breed;
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Dog Name:"+name);
		System.out.println("Breed Name:"+breed);
	}

	public static void main(String[] args) {
		Dog obj1=new Dog("Rocky","PitBull");
		obj1.display();
		Dog obj2=new Dog("Blacky","Labrador");
		obj2.display();
		System.out.println("By using Setter Method");
		obj1.setName("Jocky");
		obj1.setBreed("Rajapalyam");
		
		obj2.setName("Keetu");
		obj2.setBreed("Kani");
		
		obj1.display();
		obj2.display();
	}

}

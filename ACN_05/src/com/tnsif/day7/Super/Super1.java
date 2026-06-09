package com.tnsif.day7.Super;


class Animal{
	String color = "white";
	
}

class Dog extends Animal {
	// same variable name is given in parent and child 
	String color = "black";
	
	
	public void display() {
		System.out.println(color);
	}
}
public class Super1 {

	public static void main(String[] args) {

		// creating the object for child class
		Dog obj = new Dog();
		obj.display();               //output = black
		
	}

}

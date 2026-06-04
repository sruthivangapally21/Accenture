package com.tnsif.day7;

// abstract class
abstract class Animal{
	
	//abstract method - should be implemented in child class
	abstract void sound();
	
	//Non - abstract method
	void eat() {
		System.out.println("Eating");
	}
}

//child class
class Dog extends Animal{
	
	void sound() {
		System.out.println("Bark");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {

		// object should be created for child class not parent class
		Dog obj = new Dog();
		obj.sound();
		obj.eat();
	}

}

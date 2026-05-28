package org.tnsif.acc.c2tc.inheritancedemo;
	
	class Animal {
		
		    void eat() {
		        System.out.println("Eating...");
		    }
		}
		
	class Dog extends Animal {
		
		    void bark() {
		        System.out.println("Barking...");
		    }
		}
		
	class Cat extends Animal {
		
		    void meow() {
		        System.out.println("Meowing...");
		    }
		}
		
	public class Task{
		
		   public static void main(String[] args) {
		
		        Dog d = new Dog();
		        d.eat();
		        d.bark();
		
		        Cat c = new Cat();
		        c.eat();
		        c.meow();		   
		


	}

}

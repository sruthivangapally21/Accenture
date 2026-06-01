package com.tnsif.constructor;

public class ParameterizedConstructor {

	int age ;
	String name ;
	
	ParameterizedConstructor(int age, String name){       // ParameterizedConstructor
		this.name = name;
		this.age = age;	
	}
	
	//method
	void display() {
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {

		ParameterizedConstructor obj = new ParameterizedConstructor(22, "Sruthi");   // passing the values
		obj.display();
		

	}

}

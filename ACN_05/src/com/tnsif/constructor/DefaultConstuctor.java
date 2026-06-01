package com.tnsif.constructor;

public class DefaultConstuctor {

	
	//Instance variables
	String name ;
	int age;
	
	public static void main(String[] args) {
		
		//object creation
		
		DefaultConstuctor obj = new DefaultConstuctor();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
		
		DefaultConstuctor obj1 = new DefaultConstuctor();
		System.out.println(obj1.name);
		System.out.println(obj1.age);

	}

}

package com.tnsif.constructor;

public class StaticDemo {

	
	
     //instance variable
//	int count; 
	
	
	//static variable
	static int count;
	
	//static block
	static {
		count = 15;
		
		//variable = 12;
		System.out.println("Showing the static variable count: "+count);
	}
	
	
	//static method
	static void display() {
		System.out.println("Displaying the count value: "+count);
	}
	
	public static void main(String[] args) {
		System.out.println("Displaying the main method");

		display();
	}

}

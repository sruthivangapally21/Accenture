package com.tnsif.day7.Super;


class Main{
	String name = "Virat";
	
	public void method1() {
		System.out.println("Cricketer");
	}
}

class Subclass extends Main{
	String name = "Dhoni";
	
	public void method2() {
		System.out.println("Cricketer");
	}
	
	public void method3() {
		// call the parent class method
		super.method1();
	}
}
public class Super3 {

	public static void main(String[] args) {

		Subclass obj = new Subclass();
		obj.method3();
		
	}

}

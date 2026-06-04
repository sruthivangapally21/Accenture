package com.tnsif.day7;


abstract class Main{
	
	Main(){
		System.out.println("Animal constructor");
	}
	
	//abstract method
	abstract void show();
}

class Sub extends Main{
	
	void show() {
		System.out.println("Bark");
	}
	
	Sub(){
		System.out.println("Dog Constructor");
	}
	
}
public class AbstractConstructor{

	public static void main(String[] args) {

		//object should be created to abstract class only
		Sub obj = new Sub();

	}

}

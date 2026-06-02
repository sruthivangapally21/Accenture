package com.tnsif.NonAccessModifiers;

public class FinalVariablee {

	public static void main(String[] args) {

		int a = 20;                       //local variable 
		a = 100;
		System.out.println(a);
		
		
		final int b = 1234;
		//b = 200;                               // can't change the value because we declared final modifier
		System.out.println(b);
		
	}

}

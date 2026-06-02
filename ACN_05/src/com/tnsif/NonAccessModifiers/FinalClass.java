package com.tnsif.NonAccessModifiers;


final class c1{
	
	public void add() {
		int a =10, b = 20;
		System.out.println("The sum is :" +(a+b));
	}
}

final class c2{
	
	public void add1() {
		int a =10, b = 20;
		System.out.println("The summm is :" +(a+b));
	}
	
	
}
public class FinalClass {


	public static void main(String arge[]) {
		c2 obj = new c2();
		obj.add1();
	}
}

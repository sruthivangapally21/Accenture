package com.tnsif.NonAccessModifiers;


class Demo2 {
	
	 public void add() {
		int a =10, b = 20;
		System.out.println("the sum is:" +(a+b));
	}
}


class Demo3 extends Demo2{
	
	 public void add() {
		int a =10, b = 20;
		System.out.println("the sum is:" +(a+b));
	}
	
}
public class FinalMethod {

	public static void main(String[] args) {
		
		Demo3 obj = new Demo3();
		obj.add();                        


	}

}

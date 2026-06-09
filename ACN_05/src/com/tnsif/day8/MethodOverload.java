package com.tnsif.day8;

public class MethodOverload {
	
	//MethodOverload - Same name different Parameters
	
	public void show() {
		System.out.println("This is show-method with 0 parameters");
	}
	
	public void show(int a) {
		System.out.println("This is show-method with 1 parameters " +a);
	}
	
	public void show(double a) {
		System.out.println("This is show-method with 1 parameters " +a);
	}
	
	public void show(int a, int b) {
		System.out.println("This is show-method with 2 parameters" +a+ " and " +b);
	}
	
	public void show(int a, int b, int c) {
		System.out.println("This is show-method with 3 parameters" +a+ " and " +b+ " and " + (a+b+c));
	}
	
	public void show(int a, float b) {
		System.out.println("This is show-method with 2 parameters" +a+ " and " +b);
	}
	
	public void show(float a, int b) {
		System.out.println("This is show-method with 2 parameters" +a+ " and " +b);
	}
}

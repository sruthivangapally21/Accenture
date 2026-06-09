package com.tnsif.day8;

// This is the parent class
public class MethodOverride {
	public void build() {
		System.out.println("My father constructed 2 floors building");
	}

}

class child extends MethodOverride{
	
	public void build() {
		System.out.println("I have re-constructed 3 floors building");
	}
}

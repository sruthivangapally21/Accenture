package com.tnsif.day7;

abstract class mainclass{
	
	abstract public void add();
	
	public void result() {
		System.out.println("This is non-abstract class");
	}
}

class subclass extends mainclass{
	public void add() {
		System.out.println("Main data is present heree");
	}
	
}

public class AbstractModifier{
	
	public static void main(String args[]) {
		
		subclass obj = new subclass();
		obj.add();
	}
}

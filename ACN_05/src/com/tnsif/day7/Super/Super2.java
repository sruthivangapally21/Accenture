package com.tnsif.day7.Super;


class Animal1{
	String color = "White";
}

class dog extends Animal1{
	String color = "Yellow";
	
	void display() {
		//  [super.color] -- Java access the color variable from the parent class 
		System.out.println(super.color);
	}
}

public class Super2 {

	public static void main(String[] args) {

		dog d = new dog();
		d.display();               //output = white
	}

}

package com.tnsif.NonAccessModifiers;

public class StaticMethod {

	static void add() {
		System.out.println(10 + 10);
	}
	public static void main(String[] args) {

		// to access
		StaticMethod.add();
	}

}

package com.tnsif.day8;

public class OverloadDemo {

	public static void main(String[] args) {

		MethodOverload obj = new MethodOverload();
		obj.show();
		obj.show(10);
		obj.show(20,30);
		obj.show(20, 30, 40);
	}

}

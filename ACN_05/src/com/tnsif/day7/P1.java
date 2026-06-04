package com.tnsif.day7;

abstract class Bank{
	
	abstract double getInterest();
	
	Bank(){
		System.out.print("Done: ");
	}
}

class SBI extends Bank{
	double getInterest() {
		return 7.5;
	}
}

class HDFC extends Bank{
	double getInterest() {
		return 8.0;
	}
}
public class P1 {

	public static void main(String[] args) {

		SBI obj = new SBI();
		System.out.print(obj.getInterest());
	}

}

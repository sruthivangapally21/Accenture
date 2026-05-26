package com.tnsif.day1;

public class Elifcond {

	public static void main(String[] args) {
		
		// if marks r b/w 100 - 80 then A grade, 50-79 -- B, 35- 49 -- C, <35 --Fail
		
		int marks = 78;
		
		if(marks>=80 && marks<=100)
		{
			System.out.println("Your grade is A");
		}
		else if(marks>= 50 && marks<=79)
		{
			System.out.println("Your grade is B");
		}
		else if(marks>=35 && marks <=49)
		{
			System.out.println("Your grade is C");	
		}
		else
		{
			System.out.println("Fail");
		}
	}

}

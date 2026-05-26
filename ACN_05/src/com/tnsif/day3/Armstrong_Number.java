package com.tnsif.day3;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		// ------   Armstrong Number   --------
		
		int n = 153;
		int temp = n;
		int sum = 0;
		int rem;
		
		while (n > 0)
		{
			rem = n % 10;
			sum = sum + (rem* rem* rem);
			n = n/10;
			
		}
		System.out.println("sum is: "+sum);
		if( temp == sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}

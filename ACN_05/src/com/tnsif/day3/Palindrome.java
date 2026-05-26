//package com.tnsif.day3;
//
//public class Palindrome {
//
//	public static void main(String[] args) {
//
//		String s = "madam";
//		String rev = "";
//		
//		for (int i = s.length()-1; i >= 0; i--)
//		{
//			rev = rev + s.charAt(i);
//		}
//		
//		if(s.equals(rev))
//		{
//			System.out.println("It is a palindrome");
//		}
//		else
//		{
//			System.out.println("It is not a palindrome");
//		}
//	}
//
//}






package com.tnsif.day3;

public class Palindrome {

	public static void main(String[] args) {

		int n = 121;
		int temp = n;
		int rev = 0;
		int rem;

		while(n > 0)
		{
			rem = n % 10;          // get last digit
			rev = (rev * 10) + rem; // build reverse number
			n = n / 10;            // remove last digit
		}

		System.out.println("Reversed Number : " + rev);

		if(temp == rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}

	}

}

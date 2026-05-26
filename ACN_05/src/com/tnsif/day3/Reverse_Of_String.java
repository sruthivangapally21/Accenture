package com.tnsif.day3;

public class Reverse_Of_String {

	public static void main(String[] args) {

		// ---------- Reverse of a string  ----------//
		String s = "nikhitha";
		System.out.println(s.length());                    // Total length is 8 . Index is 7
		
		//for (int i = 0; i <= s.length()-1; i++)          // This condition prints from index 0 to last
		
		
		
		for(int i = s.length()-1; i >= 0; i--)	           // condition prints reverse of the string
		{
			//System.out.println(i);
			System.out.print(s.charAt(i));
		}

	}

}

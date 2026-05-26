package com.tnsif.day3;

public class ReverseCharArray {

	public static void main(String[] args) {


		char[] arr = {'H', 'E', 'L', 'L', 'O'};
		
		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i] +",");
		}
	}

}

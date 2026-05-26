package com.tnsif.day3;

public class Max_Number_Array {

	public static void main(String[] args) {

		int[] arr = {10, 32, 4, 53, 18};
		int max = arr[0];
		
		for (int j=0; j <= arr.length-1; j++)
		{
			if(arr[j] > max)
			{
				max = arr[j];
			}
		}
		System.out.println(max);
	}

}

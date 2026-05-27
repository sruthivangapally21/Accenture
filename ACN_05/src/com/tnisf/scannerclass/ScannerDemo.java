package com.tnisf.scannerclass;

import java.util.Scanner;         // imported Scanner Class. 

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id :");
		int id = sc.nextInt();
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your marks :");
		double marks = sc.nextDouble();
		
		System.out.println("your id : "+id+" your name: "+name+" your marks : "+marks);

	} 
} 

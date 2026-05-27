package com.tnsif.getset;

public class StudentDetails {

	public static void main(String[] args) {
		Student std = new Student();
		std.setStdid(102);
		std.setStdname("Sruthi Vangapally");
		std.setMarks(87.34);
		std.setClgname("SIIET");
		System.out.println(std.getStdid());
		System.out.println(std.getStdname());
		System.out.println(std.getMarks());
		System.out.println(std.getClgname());

	}

}
package org.tnsif.acc.c2tc.inheritancedemo;
class Employee
{
	void company()
	{
		System.out.println("Company :TNSIF");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : QA Tester");
	}
}
public class Hierarchial_Inheritance{

	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester tester=new Tester();
		
		dev.role();
		tester.role();

	}

}




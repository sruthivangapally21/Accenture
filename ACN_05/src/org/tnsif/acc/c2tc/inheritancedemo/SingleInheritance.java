package org.tnsif.acc.c2tc.inheritancedemo;
//single level inheritance
class Course  //parent class
{
	String coursename="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course : "+coursename);
	}
}
class Student extends Course   //child class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student :"+studentName);
	}
}
 public class SingleInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();
		
	}

}

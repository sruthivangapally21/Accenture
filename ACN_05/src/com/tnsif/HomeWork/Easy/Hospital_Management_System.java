package com.tnsif.HomeWork.Easy;


class Hospital{
	
	//int hospitalId;
	String hospialName;
	
	final String Location = "Hyderabad";
	
	Hospital(String hospialName){
		this.hospialName = hospialName;
	}
	
	void display() {
		System.out.println(hospialName +" " + Location);
	}
}


class Doctor extends Hospital{
	
	int doctorID;
	String doctorName;
	String Specialization;
	
	Doctor(int doctorID , String doctorName, String Specialization,String hospialName){
		
		super(hospialName);
		
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.Specialization = Specialization;
		
	}
	
	void display() {
		System.out.println("Doctor ID : " + doctorID);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Specialization : " + Specialization);
        System.out.println("Location : " + Location);
        }
}

class Patient extends Hospital{
	
	int PatientId;
	String PatientName;
	int PatientAge;
	
	Patient(int PatientId, String PatientName, int PatientAge, String hospialName){
	
		super(hospialName);
		
		this.PatientId = PatientId;
		this.PatientName = PatientName;
		this.PatientAge = PatientAge;
	}
	
	void display() {
		System.out.println("Patient ID : " + PatientId);
        System.out.println("Patient Name : " + PatientName);
        System.out.println("PatientAge : " + PatientAge);	
        }
}



public class Hospital_Management_System {

	public static void main(String[] args) {


		Hospital obj = new Hospital("Apollo");
		obj.display();
		System.out.println();
		
		Doctor obj1 = new Doctor(101, "Dr.Sruthi Vangapally", "Dermatologist", "Appolo");
		obj1.display();
		System.out.println();
		
		Patient obj2 = new Patient(11, "Ram", 24, "Appollo");
		obj2.display();
	}

}

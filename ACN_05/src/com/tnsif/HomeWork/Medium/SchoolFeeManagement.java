package com.tnsif.HomeWork.Medium;


class Student {

    int studentId;
    String studentName;

    static int totalStudents = 0;

    final String SCHOOL_NAME = "SIIET";

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudents++;
    }

    void display() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("School Name  : " + SCHOOL_NAME);
    }
}

class Engineering extends Student {

    double tuitionFee;
    double labFee;

    Engineering(int studentId, String studentName,
                double tuitionFee, double labFee) {

        super(studentId, studentName);

        this.tuitionFee = tuitionFee;
        this.labFee = labFee;
    }

    @Override
    void display() {

        super.display();

        double totalFee = tuitionFee + labFee;

        System.out.println("Department   : Engineering");
        System.out.println("Tuition Fee  : " + tuitionFee);
        System.out.println("Lab Fee      : " + labFee);
        System.out.println("Total Fee    : " + totalFee);
    }
}

class Medical extends Student {

    double tuitionFee;
    double hospitalFee;

    Medical(int studentId, String studentName,
            double tuitionFee, double hospitalFee) {

        super(studentId, studentName);

        this.tuitionFee = tuitionFee;
        this.hospitalFee = hospitalFee;
    }

    @Override
    void display() {

        super.display();

        double totalFee = tuitionFee + hospitalFee;

        System.out.println("Department   : Medical");
        System.out.println("Tuition Fee  : " + tuitionFee);
        System.out.println("Hospital Fee : " + hospitalFee);
        System.out.println("Total Fee    : " + totalFee);
    }
}

public class SchoolFeeManagement {

    public static void main(String[] args) {

        Engineering e1 =
                new Engineering(101, "Sruthi",
                        50000, 10000);

        Medical m1 =
                new Medical(201, "Ram",
                        70000, 15000);

        System.out.println("===== Engineering Student =====");
        e1.display();

        System.out.println();

        System.out.println("===== Medical Student =====");
        m1.display();

        System.out.println();

        System.out.println("Total Students : "
                + Student.totalStudents);
    }
}
package com.tnsif.HomeWork.Medium;


class Cab {

    int cabId;
    String driverName;

    static int totalBookings = 0;

    final String COMPANY_NAME = "Uber";

    Cab(int cabId, String driverName) {

        this.cabId = cabId;
        this.driverName = driverName;

        totalBookings++;
    }

    void display() {

        System.out.println("Company Name : " + COMPANY_NAME);
        System.out.println("Cab ID       : " + cabId);
        System.out.println("Driver Name  : " + driverName);
    }
}

class BookedCab extends Cab {

    String customerName;
    String pickupLocation;
    String destination;
    double fare;

    BookedCab(int cabId,
              String driverName,
              String customerName,
              String pickupLocation,
              String destination,
              double fare) {

        super(cabId, driverName);

        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.fare = fare;
    }

    @Override
    void display() {

        super.display();

        System.out.println("Customer Name : " + customerName);
        System.out.println("Pickup        : " + pickupLocation);
        System.out.println("Destination   : " + destination);
        System.out.println("Fare          : " + fare);
        System.out.println("Status        : Booked");
    }
}

public class CabBookingSystem {

    public static void main(String[] args) {

        Cab c1 = new Cab(
                101,
                "Ramesh");

        BookedCab c2 = new BookedCab(
                102,
                "Suresh",
                "Sruthi",
                "Miyapur",
                "Hitech City",
                350.50);

        System.out.println("===== Cab Details =====");
        c1.display();

        System.out.println();

        System.out.println("===== Booking Details =====");
        c2.display();

        System.out.println();

        System.out.println("Total Bookings : "
                + Cab.totalBookings);
    }
}
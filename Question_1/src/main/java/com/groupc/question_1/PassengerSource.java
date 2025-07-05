/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.groupc.question_1;
import java.util.Random;
import javax.tools.JavaFileManager.Location;

/**
 *
 * @author micheal
 */

public class PassengerSource {
    private Company company;
    private Random random;

    // Constructor taking a Company object
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    /**
     *Creates a new Passenger, generates random pickup and destination locations,
     * and uses the company to schedule a vehicle. Returns true if successful.
     */
    
    public boolean requestPickup() {
        Passenger passenger = new Passenger();

        MyLocation pickup = new MyLocation(random.nextInt(101), random.nextInt(101));
        MyLocation destination = new MyLocation(random.nextInt(101), random.nextInt(101));

        return company.schedulePickup(passenger, pickup, destination);
    }


    public static void main(String[] args) {
        // Create a Company instance
        Company company = new Company();

        // Create PassengerSource with the company
        PassengerSource source = new PassengerSource(company);

        // Request a pickup and store the result
        boolean success = source.requestPickup();

        // Output the result
        if (success) {
            System.out.println("Pickup successfully scheduled!");
        } else {
            System.out.println("Pickup scheduling failed.");
        }
    }
}


class Company {
        
        public boolean schedulePickup(Passenger passenger, MyLocation pickup, MyLocation destination) {
    System.out.println("Scheduling pickup at (" + pickup.getX() + ", " + pickup.getY() + ")"
            + " to destination (" + destination.getX() + ", " + destination.getY() + ")");

    // Fail if pickup and destination are the same point
    if (pickup.getX() == destination.getX() && pickup.getY() == destination.getY()) {
        return false;
    }

    return true;
        }
    
}

class Passenger {
    // Represents a passenger;
}

class MyLocation {
    private int x;
    private int y;

    public MyLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
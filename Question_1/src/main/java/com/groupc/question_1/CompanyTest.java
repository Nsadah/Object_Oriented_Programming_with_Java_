/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupc.question_1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author micheal
 */

public class CompanyTest {
    @Test
    public void testSchedulePickupSuccess() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        MyLocation pickup = new MyLocation(10, 20);
        MyLocation destination = new MyLocation(30, 40);

        boolean result = company.schedulePickup(passenger, pickup, destination);

        assertTrue(result, "Pickup with different locations should succeed.");
    }

    @Test
    public void testSchedulePickupFailureSameLocation() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        MyLocation pickup = new MyLocation(50, 50);
        MyLocation destination = new MyLocation(50, 50); // Same as pickup

        boolean result = company.schedulePickup(passenger, pickup, destination);

        assertFalse(result, "Pickup with same pickup and destination should fail.");
    }
}

package com.travelproject.trave;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.travelproject.trave.Enums.PassengerType;
import com.travelproject.trave.Model.Activity;
import com.travelproject.trave.Model.Destination;
import com.travelproject.trave.Model.Passenger;
import com.travelproject.trave.Model.TravelPackage;

@SpringBootTest
class TraveApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
    public void testActivityConstructor() {
        Activity activity = new Activity(0, "Swimming", "Swim in the pool", 20.0, 10, 0, null, null);
        assertEquals("Swimming", activity.getName());
        assertEquals("Swim in the pool", activity.getDescription());
        assertEquals(20.0, activity.getCost(), 0.001);
        assertEquals(10, activity.getCapacity());
    }
	@Test
    public void testDestinationConstructor() {
        Destination destination = new Destination(0, "Beach", null, null);
        assertEquals("Beach", destination.getName());
    }
	@Test
    public void testPassengerConstructor() {
        Passenger passenger = new Passenger(0, "John", 1, PassengerType.STANDARD, 200.0, null, null);
        assertEquals("John", passenger.getName());
        assertEquals(1, passenger.getPassengerNumber());
        assertEquals(PassengerType.STANDARD, passenger.getPassengerType());
        assertEquals(200.0, passenger.getBalance(), 0.001);
    }
	@Test
    public void testTravelPackageConstructor() {
        TravelPackage travelPackage = new TravelPackage(0, "Package 1", 10, null, null);
        assertEquals("Package 1", travelPackage.getName());
        assertEquals(10, travelPackage.getPassengerCapacity());
    }

}

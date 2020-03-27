import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane1;
    Flight flight;
    FlightManager flightManager;
    Passenger passenger1;
    Passenger passenger2;
    Date depTime;

    @Before
    public void before(){
        depTime = new Date(2020,03,29,16,00);
        plane1 = new Plane(PlaneType.BOEING747, 300, 183500);
        flight = new Flight(plane1, "BE7612", "LCY", "ABZ", depTime);
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Aga", 2);
        passenger2 = new Passenger("Gareth", 3);
    }

    @Test
    public void canGetBaggageAllowance(){
        assertEquals(305, flightManager.getBaggageAllowance());
    }

    @Test
    public void canGetBookedBaggageWeight(){
        flight.add(passenger1);
        flight.add(passenger2);
        assertEquals(610, flightManager.getBookedBaggageWeight());
    }

    @Test
    public void canGetRemainingBaggageWeight(){
        flight.add(passenger1);
        flight.add(passenger2);
        assertEquals(91140, flightManager.getRemainingBaggaeWeight());
    }

}

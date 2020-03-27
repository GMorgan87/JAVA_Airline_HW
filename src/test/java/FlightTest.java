import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;
    Date depTime;

    @Before
    public void before(){
        depTime = new Date(2020,03,29,16,00);
        plane = new Plane(PlaneType.GULFSTREAMG650, 5, 10000);
        flight = new Flight(plane, "BE7612", "EDI", "LCY", depTime);
        passenger = new Passenger("Age", 2);

    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void canGetflightNo(){
        assertEquals("BE7612", flight.getFlightNo());
    }
    @Test
    public void canGetDestination(){
        assertEquals("EDI", flight.getDestination());
    }
    @Test
    public void canGetDepAirport(){
        assertEquals("LCY", flight.getDepAirport());
    }
    @Test
    public void canGetDepTime(){
        assertEquals(depTime, flight.getDepTime());
    }

    @Test
    public void canGetNumberOfPassengers(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        flight.add(passenger);
        assertEquals(1, flight.passengerCount());
    }
}
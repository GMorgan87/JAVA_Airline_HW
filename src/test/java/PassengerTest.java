import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Flight flight;
    Plane plane;
    Date depTime;

    @Before
    public void before() {
        passenger1 = new Passenger("Gareth", 2);
        plane = new Plane(PlaneType.GULFSTREAMG650, 1, 10000);
        flight = new Flight(plane, "BE7612", "EDI", "LCY", depTime);
    }

    @Test
    public void canGetName() {
        assertEquals("Gareth", passenger1.getName());
    }

    @Test
    public void canGetNoOfBags() {
        assertEquals(2, passenger1.getNoOfBags());
    }

    @Test
    public void passengerHasFlight(){
        flight.add(passenger1);
        assertEquals(flight, passenger1.getFlight());
    }

    @Test
    public void passengerHasSeatNumber(){
        flight.add(passenger1);
        assertEquals(1, passenger1.getSeatNumber());
    }

}

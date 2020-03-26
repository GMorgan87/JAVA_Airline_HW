import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.GULFSTREAMG650, 5, 10000);
        flight = new Flight(plane, "BE7612", "LCY", "ABZ", "1600");
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
        assertEquals("LCY", flight.getDestination());
    }
    @Test
    public void canGetDepAirport(){
        assertEquals("ABZ", flight.getDepAirport());
    }
    @Test
    public void canGetDepTime(){
        assertEquals("1600", flight.getDepTime());
    }
}

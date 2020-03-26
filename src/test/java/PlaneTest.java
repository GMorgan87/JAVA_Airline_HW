import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.GULFSTREAMG650, 2, 10000);
        passenger1 = new Passenger("Gareth", 2);
        passenger2 = new Passenger("Aga", 3);

    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.GULFSTREAMG650, plane1.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, plane1.getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(10000, plane1.getWeight());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(2, plane1.getSeats());
    }

    @Test
    public void canAddPassenger(){
        plane1.addPassenger(passenger1);
        assertEquals(1, plane1.getSeats());
    }
}

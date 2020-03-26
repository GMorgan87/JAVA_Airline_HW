import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before() {
        passenger1 = new Passenger("Gareth", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Gareth", passenger1.getName());
    }

    @Test
    public void canGetNoOfBags() {
        assertEquals(2, passenger1.getNoOfBags());
    }

}

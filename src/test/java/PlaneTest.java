import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.GULFSTREAMG650, 5, 10000);
    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.GULFSTREAMG650, plane1.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, plane1.getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(10000, plane1.getWeight());
    }
}

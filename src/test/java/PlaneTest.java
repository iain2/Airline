import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("NIMBUS 2000");
    }

    @Test
    public void hasName(){
        assertEquals("NIMBUS 2000", plane.getName());
    }
}

import employee.Pilot;
import employee.rankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Garry", rankType.CAPTAIN, "63834");
    }

    @Test
    public void hasName(){
        assertEquals("Garry", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(rankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicense(){
        assertEquals("63834", pilot.getPilotsLicense());
    }

    @Test
    public void canDrivePlane(){
        assertEquals("Brrrrr", pilot.drivePlane());
    }

}

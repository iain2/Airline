import employee.CabinCrewMember;
import employee.rankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {


    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Larry", rankType.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Larry", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(rankType.PURSER, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        String message = "Hold on tight!!!";
        assertEquals("Hold on tight!!!", cabinCrewMember.relayMessage(message));
    }

}

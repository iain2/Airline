import employee.CabinCrewMember;
import employee.Pilot;
import employee.rankType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    Flight flight;

    Pilot pilot;
    Person passenger;

    Plane plane;

    CabinCrewMember crewMember;

    FlightManager flightManager;

    @Before
    public void before(){
        plane = new Plane("AirBus");
        crewMember = new CabinCrewMember("Jarry", rankType.FLIGHTATTENDANT);
        passenger = new Person("Darry", 3);
        pilot = new Pilot("Harry", rankType.CAPTAIN, "123");
        flight = new Flight(pilot, plane, "123", "GLA", "EDI", "14:00", 100);
        flight.addPassenger(passenger);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasFlight(){
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void hasReservedBagWeight(){
        assertEquals(50, flightManager.getReservedBagWeight());
    }

    @Test
    public void hasBookedBagWeight(){
        assertEquals(3, flightManager.getBookedBaggageWeight());
    }

    @Test
    public void hasRemainingReservedBaggageWeight(){
        assertEquals(47, flightManager.getRemainingReservedBaggageWeight());
    }



}

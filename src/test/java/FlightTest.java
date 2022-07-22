import employee.CabinCrewMember;
import employee.Pilot;
import employee.rankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Pilot pilot;
    Person passenger;

    Plane plane;

    CabinCrewMember crewMember;

    @Before
    public void before(){
        plane = new Plane("AirBus");
        crewMember = new CabinCrewMember("Jarry", rankType.FLIGHTATTENDANT);
        passenger = new Person("Darry", 3);
        pilot = new Pilot("Harry", rankType.CAPTAIN, "123");
        flight = new Flight(pilot, plane, "123", "GLA", "EDI", "14:00", 100);
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasPassengerCount(){
        assertEquals(0,flight.getPassengerCount());
    }
    @Test
    public void hasCabinCrewCount(){
        assertEquals(0,flight.getCrewCount());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canAddCabinCrew(){
        flight.addCabinCrew(crewMember);
        assertEquals(1, flight.getCrewCount());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("123", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void hasTotalSeats(){
        assertEquals(100, flight.getTotalSeats());
    }

    @Test
    public void hasTotalAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(99, flight.totalAvailableSeats());
    }

    @Test public void cannotAddPassengerWhenNoAvailableSeats(){
        flight2 = new Flight(pilot, plane, "123", "GLA", "EDI", "14:00", 1);
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        assertEquals(1, flight2.getPassengerCount());
    }

    @Test
    public void hasBaggageCount(){
        flight.addPassenger(passenger);
        assertEquals(3, flight.getBaggageCount());
    }


}

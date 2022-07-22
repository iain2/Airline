import employee.CabinCrewMember;
import employee.Pilot;

import java.util.ArrayList;


public class Flight {


    private String departure;
    private int totalSeats;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private Pilot pilot;
    private String departureTime;
    private ArrayList<CabinCrewMember> cabinCrewMemberList;
    private ArrayList<Person> passengerList;
    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departure, String departureTime, int totalSeats) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.cabinCrewMemberList = new ArrayList<CabinCrewMember>();
        this.passengerList = new ArrayList<Person>();


    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getCrewCount(){
        return cabinCrewMemberList.size();
    }

    public int getPassengerCount(){
        return passengerList.size();
    }


    public void addPassenger(Person passenger) {
        if(this.getPassengerCount() < totalSeats) {
            passengerList.add(passenger);
        }
    }

    public void addCabinCrew(CabinCrewMember cabinCrew){
        cabinCrewMemberList.add(cabinCrew);
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }



    public int getTotalSeats() {
        return totalSeats;
    }

    public int totalAvailableSeats() {
        return totalSeats - passengerList.size();
    }

    public int getBaggageCount() {
        int total = 0;
        for (Person passenger : passengerList){
            total += passenger.getNumberOfBags();
        }
        return total;
    }
}

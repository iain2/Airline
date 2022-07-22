public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getReservedBagWeight() {
        return flight.getTotalSeats() / 2;
    }


    public int getBookedBaggageWeight() {
        return flight.getBaggageCount();
    }

    public int getRemainingReservedBaggageWeight() {
        return this.getReservedBagWeight() - this.getBookedBaggageWeight();
    }
}

public class FlightManager {

    private Flight flight;
    private Plane plane;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.plane = flight.getPlane();
    }


    public int getBaggageCapacity(){
        return plane.getWeight()/2;
    }

    public int getBaggageAllowance() {
        return (int) Math.floor((double) getBaggageCapacity()/plane.getCapacity());
    }

    public int getBookedBaggageWeight() {
        return getBaggageAllowance() * flight.passengerCount();
    }

    public int getRemainingBaggaeWeight() {
        return getBaggageCapacity() - getBookedBaggageWeight();
    }
}

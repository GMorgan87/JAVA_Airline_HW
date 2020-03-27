import java.util.ArrayList;
import java.util.Date;

public class Flight {

    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNo;
    String destination;
    String depAirport;
    Date depTime;


    public Flight(Plane plane, String flightNo, String destination, String depAirport, Date depTime) {
        passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepAirport() {
        return this.depAirport;
    }

    public Date getDepTime() {
        return this.depTime;
    }


    public int passengerCount() {
        return passengers.size();
    }

    public void add(Passenger passenger) {
        passengers.add(passenger);
        passenger.setFlight(this);
    }
}


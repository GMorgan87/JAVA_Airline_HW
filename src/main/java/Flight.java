import java.util.ArrayList;

public class Flight {

    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNo;
    String destination;
    String depAirport;
    String depTime;


    public Flight(Plane plane, String flightNo, String destination, String depAirport, String depTime) {
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

    public String getDepTime() {
        return this.depTime;
    }
}

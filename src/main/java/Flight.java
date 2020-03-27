import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Flight {

    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNo;
    String destination;
    String depAirport;
    Date depTime;
    ArrayList<Integer> seatNums;


    public Flight(Plane plane, String flightNo, String destination, String depAirport, Date depTime) {
        passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
        this.seatNums = new ArrayList<Integer>();
        createSeatNumbers();

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

    public ArrayList<Integer> createSeatNumbers(){
        int i = 1;
        while (i <= plane.getCapacity()){
            this.seatNums.add(i);
            i++;
        }
        Collections.shuffle(seatNums);
        return seatNums;
    }

    public int getSeatNumber(){
        return seatNums.remove(0);
    }

    public void add(Passenger passenger) {
        passengers.add(passenger);
        passenger.setFlight(this);
        passenger.setSeatNumber(getSeatNumber());
    }
}


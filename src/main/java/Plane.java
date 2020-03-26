import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int weight;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType , int capacity, int weight) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getSeats() {
        return this.capacity - this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(getSeats() > 0){
        this.passengers.add(passenger);
        }
    }
}

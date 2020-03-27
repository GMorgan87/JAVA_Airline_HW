public class Passenger {

    private String name;
    private int noOfBags;
    private Flight flight;

    public Passenger(String name, int noOfBags) {
        this.name = name;
        this.noOfBags = noOfBags;
        this.flight = null;
    }

    public String getName(){
        return this.name;
    }

    public int getNoOfBags(){
        return this.noOfBags;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }
}

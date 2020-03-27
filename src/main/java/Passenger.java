public class Passenger {

    private String name;
    private int noOfBags;
    private Flight flight;
    int seatNumber;

    public Passenger(String name, int noOfBags) {
        this.name = name;
        this.noOfBags = noOfBags;
        this.flight = null;
        this.seatNumber = 0;
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

    public void setSeatNumber(int number){
        this.seatNumber = number;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }
}

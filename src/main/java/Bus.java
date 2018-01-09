import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Passenger> passengerList;
    private int capacity;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.passengerList = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumberOfPassengers() {
        return this.passengerList.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassenger(Passenger passenger) {
        if (!isFull()){
            this.passengerList.add(passenger);
        }

    }

    public boolean isFull() {
        return this.passengerList.size() >= capacity;
    }

    public void removePassenger(Passenger passenger) {
        this.passengerList.remove(passenger);
    }

    public void pickUp(BusStop busStop) {
        addPassenger(busStop.removePassenger());
    }
}

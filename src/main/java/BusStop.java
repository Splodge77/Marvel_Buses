import java.util.ArrayList;

public class BusStop {

    private String name;
    public ArrayList<Passenger> queue;

    public BusStop (String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public ArrayList<Passenger> getQueue() {
        return this.queue;
    }

    public void addPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePassenger() {
        return this.queue.remove(0);

    }
}

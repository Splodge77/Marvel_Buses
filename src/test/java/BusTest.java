import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    BusStop busStop;
    Passenger passenger;

    @Before
    public void before(){

        bus = new Bus("Earth", 2);
        busStop = new BusStop("Moon");
        passenger = new Passenger();

    }

    @Test
    public void getCapacity(){
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void busStartsWithNoPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void busPassengersAdded(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void busRejectsPassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);

        assertEquals(2, bus.getNumberOfPassengers() );
    }

    @Test
    public void busIsFull(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(true, bus.isFull());
    }

    @Test
    public void busIsNotFull(){
        bus.addPassenger(passenger);
        assertEquals(false, bus.isFull());
    }

    @Test
    public void passengerIsRemoved(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void pickUpPassenger(){
        busStop.addPassenger(passenger);
        bus.pickUp(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
        assertEquals(0, busStop.getQueue().size());
    }


}

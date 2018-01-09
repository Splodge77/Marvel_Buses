import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Moon");
    }

    @Test
    public void busStopHasName(){
        assertEquals("Moon", busStop.getName());
    }

    @Test
    public void queueIsEmpty(){
        assertEquals(0, busStop.getQueue().size());
    }

    @Test
    public void personIsAdded(){
        Passenger passenger = new Passenger();
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.getQueue().size());
    }

    @Test
    public void personIsRemoved(){
        Passenger passenger = new Passenger();
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        busStop.removePassenger();
        assertEquals(1, busStop.getQueue().size());
    }
}

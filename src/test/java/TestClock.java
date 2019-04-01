import clock.Clock;
import org.junit.jupiter.api.Test;
import time.Time;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClock {
    @Test
    void testCreateClock() {
        Clock clock = new Clock(new Time(5, 10));
    }

    @Test
    void getClock(){
        Clock clock = new Clock(new Time(5, 10));
        assertEquals(new Time(5,10), clock.getTime());
    }
}

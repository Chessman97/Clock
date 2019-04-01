import clock.Clock;
import org.junit.jupiter.api.Test;
import time.Time;

public class TestClock {
    @Test
    void testCreateClock() {
        Clock clock = new Clock(new Time(5, 10));
    }
}

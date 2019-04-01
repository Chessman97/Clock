import org.junit.jupiter.api.Test;
import time.Time;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTime {

    @Test
    void testCreateConcrateTime() {
        Time time = new Time(5, 10);
    }

    @Test
    void testGetTime(){
        Time time = new Time(5, 10);
        assertEquals(new Time(5, 10), time);
    }

    @Test
    void testGetHour(){
        Time time = new Time(5, 10);
        assertEquals(5, time.getHour());
    }
}

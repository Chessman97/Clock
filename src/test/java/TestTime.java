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

        Time time1 = new Time (11, 55);
        assertEquals(11, time1.getHour());
    }

    @Test
    void testGetMinute(){
        Time time = new Time(5, 10);
        assertEquals(10, time.getMinute());

        Time time1 = new Time (11, 55);
        assertEquals(55, time1.getMinute());
    }
}

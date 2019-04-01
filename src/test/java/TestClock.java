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

        Clock clock1 = new Clock(new Time(10, 11));
        assertEquals(new Time(10,11), clock1.getTime());
    }

    @Test
    void setSignalClock(){
        Clock clock = new Clock(new Time(5, 10));
        clock.setSignal(new Time(5, 0), 5);
    }

    @Test
    void signalAlarmClock(){
        Clock clock = new Clock(new Time(5, 10));
        clock.setSignal(new Time(5, 10), 5);
        assertEquals(true, clock.signalAlarm());
    }

    @Test
    void notSignalAlarmClock(){
        Clock clock = new Clock(new Time(5, 10));
        clock.setSignal(new Time(6, 0), 5);
        assertEquals(false, clock.signalAlarm());
    }

    @Test
    void alarmFiveMinutesClock(){
        Time time = new Time(5, 9);
        Clock clock = new Clock(time);
        clock.setSignal(new Time(5, 10), 5);
        assertEquals(false, clock.signalAlarm());
        time.setTime(5, 10);
        assertEquals(true, clock.signalAlarm());
        time.setTime(5, 11);
        assertEquals(true, clock.signalAlarm());
        time.setTime(5, 15);
        assertEquals(false, clock.signalAlarm());
    }

    @Test
    void signingAlarmClock(){
        Clock clock = new Clock(new Time(5, 9));
        clock.setSignal(new Time(5, 0), 10);
        assertEquals(true, clock.signalAlarm());
    }
}

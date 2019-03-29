import org.junit.jupiter.api.Test;
import time.Time;

public class TestTime {
    @Test
    void testCreateTime() {
        Time time = new Time();
    }

    @Test
    void testCreateConcrateTime() {
        Time time = new Time(5, 10);
    }
}

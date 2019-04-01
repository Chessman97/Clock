package clock;

import time.Time;

public class Clock {
    private Time time;
    public Clock(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }
}

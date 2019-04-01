package clock;

import time.Time;

public class Clock {

    private Time time;
    private Time signalTime;
    public Clock(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setSignal(Time time) {
        signalTime = time;
    }
}

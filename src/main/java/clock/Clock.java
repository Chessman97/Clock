package clock;

import time.Time;

public class Clock {

    private Time time;
    private int alarmed;
    private Time signalTime;
    public Clock(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setSignal(Time time, int alarmed) {
        signalTime = time;
        this.alarmed = alarmed;
    }

    public boolean signalAlarm() {
        return time.sub(signalTime) < 5 && time.sub(signalTime) >= 0;
    }

}

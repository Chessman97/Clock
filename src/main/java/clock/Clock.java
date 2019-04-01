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

    public void setSignal(Time time, int i) {
        signalTime = time;

    }

    public boolean signalAlarm() {
        return time.equals(signalTime);
    }

    public void setAlarm(int i) {

    }
}

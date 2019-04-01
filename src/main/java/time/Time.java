package time;

public class Time {
    private int hour;

    public Time(int hour, int minute) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Time) {
            Time t = (Time) obj;
            return getHour() == t.getHour() && getMinute() == t.getMinute();
        }
        return false;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return 10;
    }
}

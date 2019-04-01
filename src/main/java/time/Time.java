package time;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
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
        return minute;
    }

    public int sub(Time time) {
        return Math.abs(time.getMinute() - getMinute());
    }
}

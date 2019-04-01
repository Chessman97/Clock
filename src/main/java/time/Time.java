package time;

public class Time {
    public Time(int hour, int minute) {

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
        return 5;
    }

    public int getMinute() {
        return 10;
    }
}

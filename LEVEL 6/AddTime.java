
import java.util.*;

class Time {

    int hour;
    int minute;

    public Time(int h, int m) {

        this.hour = h;
        this.minute = m;
    }

    public void add(Time t2) {
        int temph = 0;
        int tempm ;

        tempm = this.minute + t2.minute;
        if (tempm >= 60) {
            tempm = tempm - 60;
            temph++;
        }
        temph = temph + this.hour + t2.hour;

        System.out.println("hour :" + temph + "minute" + tempm);

    }

}

public class AddTime {
    public static void main(String[] args) {

        Time t1 = new Time(4, 20);
        Time t2 = new Time(3, 50);

        t1.add(t2);

    }
}

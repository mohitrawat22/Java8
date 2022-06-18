package PMC;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {

        // creating timer task, timer
        TimerTask tasknew = new LogTimerTask();
        Timer timer = new Timer();

        // scheduling the task at interval
        timer.schedule(tasknew,1000, 1000);
    }
}

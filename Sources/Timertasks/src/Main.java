import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed!");
            }
        };

        timer.schedule(task, 3000); // Delay of 3 seconds
        // timer.schedule(task, 0, 1000); // Repeats every 1 second
    }
}

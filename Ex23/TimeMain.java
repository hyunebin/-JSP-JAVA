package Ex23;

import java.util.Timer;
import java.util.TimerTask;

public class TimeMain{
    public static void main(String[] args) throws InterruptedException {
        new TimerClass();
    }
}


class TimerClass {

    public TimerClass() throws InterruptedException{
        System.out.println("^^");
        Timer timer = new Timer();
        TimerTask t1 = new ExTimerTask1();
        TimerTask t2 = new ExTimerTask2();

        timer.schedule(t1,2000);
        timer.schedule(t2, 10000);

        Thread.sleep(11000);
        System.out.println("^^");
    }
}

class ExTimerTask1 extends TimerTask {
    public void run(){
        System.out.println("Task1:이곳의 작업이 실행됩니다.");
    }
}

class ExTimerTask2 extends TimerTask{
    @Override
    public void run() {
        {
            System.out.println("Task2: 이곳의 작업이 실행됩니다.");
        }
    }
}
package L5.A1;

import java.util.concurrent.locks.Lock;

public class Fir2 extends Thread {
    Lock l1;
    Lock l2;
    int activity_min, activity_max, sleep;

    public Fir2(Lock l1, Lock l2, int activity_min, int activity_max, int sleep) {
        this.l1 = l1;
        this.l2 = l2;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " - STATE 1");

        l1.lock();
        l2.lock();

        System.out.println(this.getName() + " - STATE 2");
        int k = (int) Math.round(Math.random() * (activity_max
                - activity_min) + activity_min);


        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {

        }


        l1.unlock();
        l2.unlock();
        System.out.println(this.getName() + " - STATE 3");
    }
}

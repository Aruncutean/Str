package L4.Ex2;

public class Fir1 extends Thread {


    Integer monitor1;
    Integer monitor2;
    int activity_min1, activity_max1, activity_min2, activity_max2, sleep;

    public Fir1(Integer monitor1, Integer monitor2, int activity_min1, int activity_max1, int activity_min2, int activity_max2, int sleep) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.activity_min1 = activity_min1;
        this.activity_max1 = activity_max1;
        this.activity_min2 = activity_min2;
        this.activity_max2 = activity_max2;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        int k = (int) Math.round(Math.random() * (activity_max1
                - activity_min1) + activity_min1);

        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }

        synchronized (monitor1) {
            synchronized (monitor2) {


                System.out.println(this.getName() + " - STATE 2");
                int k2 = (int) Math.round(Math.random() * (activity_max2
                        - activity_min2) + activity_min2);

                for (int i = 0; i < k2 * 100000; i++) {
                    i++;
                    i--;
                }
                synchronized (monitor2) {

                }
                System.out.println(this.getName() + " - STATE 3");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(this.getName() + " - STATE 4");

    }
}

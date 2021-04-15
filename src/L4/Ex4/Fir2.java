package L4.Ex4;

public class Fir2 extends Thread {

    Resursa monitor;

    int activity_min, activity_max;


    public Fir2( Resursa monitor, int activity_min, int activity_max) {
        this.monitor = monitor;
        this.activity_min = activity_min;
        this.activity_max = activity_max;

    }


    @Override
    public void run() {
        monitor.merge();
        System.out.println(this.getName() + " - STATE 1");
        int k = (int) Math.round(Math.random() * (activity_max
                - activity_min) + activity_min);

        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
        System.out.println(this.getName() + " - STATE 2");


    }
}

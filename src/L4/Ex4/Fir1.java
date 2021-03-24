package L4.Ex4;

public class Fir1 extends Thread {


    Resursa monitor1;
    Resursa monitor2;
    int activity_min, activity_max;
    Resursa resursa;

    public Fir1( Resursa monitor1, Resursa monitor2, int activity_min, int activity_max) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.activity_min = activity_min;
        this.activity_max = activity_max;

    }


    @Override
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        int k = (int) Math.round(Math.random() * (activity_max
                - activity_min) + activity_min);

        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }

        monitor1.merge();
        monitor2.merge();
        System.out.println(this.getName() + " - STATE 2");


    }
}

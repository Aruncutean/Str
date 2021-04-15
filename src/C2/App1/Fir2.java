package C2.App1;

public class Fir2 extends Thread {

    private MS ms;

    public Fir2(MS ms) {
        this.ms = ms;
    }


    @Override
    public void run() {
        System.out.println("P1");
        System.out.println("P3");

        ms.asteapta();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ms.porneste();
        System.out.println("P6");
        System.out.println("P9");


    }
}

package C2.App1;

public class Fir1 extends Thread {


    private MS ms;

    public Fir1(MS ms) {
        this.ms = ms;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("P2");

        ms.porneste();
        System.out.println("P5");

        System.out.println("P8");
        ms.asteapta();
        System.out.println("P10");


    }

}

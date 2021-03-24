package L3.P2;

public class Resursa {

    private int a;
    private boolean c;

    public synchronized void scrie(int b) {

        try {
            wait(11);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.a = b;
        notify();
    }

    public synchronized int citeste() {
        try {
            wait(11);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }

}

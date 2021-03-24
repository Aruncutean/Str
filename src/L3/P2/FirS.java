package L3.P2;

public class FirS extends Thread {
    private Resursa r;

    FirS(Resursa r) {
        this.r = r;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            r.scrie(i);
            System.out.println("Am scris: " + i);
        }
    }
}

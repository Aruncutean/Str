package L5.A1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();

        Fir1 fir = new Fir1(l1, 2, 4, 4);
        Fir2 fir2 = new Fir2(l1, l2, 3, 6, 3);
        Fir1 fir3 = new Fir1(l2, 2, 5, 5);

        fir.start();
        fir2.start();
        fir3.start();
    }
}

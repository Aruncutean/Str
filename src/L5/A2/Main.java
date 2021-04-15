package L5.A2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock l1=new ReentrantLock();
        Lock l2=new ReentrantLock();

        Fir fir=new Fir(l1,l2,2,4,4,6,4);
        Fir fir1=new Fir(l2,l1,3,5,5,7,5);

        fir.start();
        fir1.start();

    }

}

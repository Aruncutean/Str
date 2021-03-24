package L4.Ex4;

public class Resursa {


    public synchronized void asteapta() {

        try {
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void merge() {

        notify();

    }
}

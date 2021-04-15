package C2.App1;

public class MS {

    synchronized void asteapta() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void porneste() {
        notify();
    }


}

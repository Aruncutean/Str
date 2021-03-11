package L3.P1;

public class Fir implements Runnable {

    private static int sumTot;
    private int N;
    private int pas;
    private Thread thread;

    public Fir(int N, int pas) {
        this.N = N;
        this.pas = pas;
    }

    public void start() {
        if (thread == null) {
            this.thread = new Thread(this);
            thread.start();
        }
    }

    public void join() {
        try {
            this.join();
        } catch (StackOverflowError e) {
        }
    }

    @Override
    public void run() {
        int sum = 0;

        for (int i = 0; i < N; i = i + pas) {
            sum = sum + i;
        }
        sumTot = sumTot + sum;
        System.out.println("Name thread: " + thread.getName() + " Sum: " + sum);

    }

    public int getSumTot() {
        return sumTot;
    }


}

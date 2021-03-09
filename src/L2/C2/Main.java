package L2.C2;


class CounterRunnable implements Runnable {

    boolean loop=true;

    public void start() {
        new Thread(this).start();
    }


    public void stop() {
        this.loop = false;
    }


    public void run() {

        Thread t = Thread.currentThread();
        int i = 0;
        while (loop) {

            System.out.println(t.getName() + " i = " + i);

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 20) {
                break;
            } else {
                i++;
            }
        }

        System.out.println(t.getName() + " job finalised.");

    }

}

class Main {

    public static void main(String[] args) {

        CounterRunnable c1 = new CounterRunnable();

        CounterRunnable c2 = new CounterRunnable();

        CounterRunnable c3 = new CounterRunnable();


        c1.start();

        c2.start();

       c3.start();

    }

}


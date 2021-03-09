package L3.Ex3;

public class JoinTestThread extends Thread {
    private Thread t;
    private static int sum = 0;

    JoinTestThread(String n, Thread t) {
        this.setName(n);
        this.t = t;
    }


    private int div(int nr) {
        int sum = 0;

        for (int i = 1; i < nr; i++) {
            if (nr % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }


    public void run() {
        System.out.println("Firul " + this.getName() + " a intrat in metoda run()");
        try {
            if (t != null) t.join();
            System.out.println("Firul " + this.getName() + " executa operatie.");
            if (sum == 0) {
                sum = div(50020);
            } else {
                sum += div(25000);
                System.out.println(sum);
            }
            Thread.sleep(3000);
            System.out.println("Firul " + this.getName() + " a terminat operatia.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package L3.P1;

public class Main {

    public static void main(String[] args) {
        Fir fir1 = new Fir(40, 3);
        Fir fir2 = new Fir(40, 4);
        Fir fir3 = new Fir(40, 5);

        fir1.start();
        fir2.start();
        fir3.start();

        fir1.join();
        fir2.join();
        fir3.join();

        System.out.println(fir3.getSumTot());
    }
}

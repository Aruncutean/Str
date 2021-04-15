package L4.Ex4;


public class Main {

    public static void main(String[] args) {


        Resursa monitor1=new Resursa();
        Resursa monitor2 = new Resursa();
        Fir1 fir1 = new Fir1(monitor1,monitor2, 2, 3);
        Fir2 fir2 = new Fir2(monitor1, 3, 5);

        Fir2 fir3 = new Fir2(monitor2, 4, 6);

        fir1.start();
        fir2.start();
        fir3.start();
        try {
            fir1.join();
            fir2.join();
            fir3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}

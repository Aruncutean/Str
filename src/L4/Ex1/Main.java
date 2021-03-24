package L4.Ex1;

public class Main {
    public static void main(String[] args) {
        Integer monitor1=new Integer(1);
        Integer monitor2=new Integer(1);

        new Fir(monitor1,2,4,4).start();
        new Fir2(monitor1,monitor2,3,6,3).start();
        new Fir(monitor2,2,5,5).start();
    }
}

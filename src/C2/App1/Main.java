package C2.App1;


public class Main {
    public static void main(String[] args) {
        MS ms = new MS();
        Fir1 fir1 = new Fir1(ms);
        Fir2 fir2 = new Fir2(ms);

        fir2.start();
        fir1.start();

    }
}

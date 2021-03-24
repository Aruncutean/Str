package L3.P2;

import L3.P1.Fir;

public class Main {

    public static void main(String[] args) {
        Resursa resursa = new Resursa();
        FirS firS = new FirS(resursa);
        FirC firC = new FirC(resursa);

        firS.start();
        firC.start();

    }
}

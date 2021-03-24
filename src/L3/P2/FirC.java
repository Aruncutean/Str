package L3.P2;

public class FirC extends Thread{
    Resursa r;

    FirC(Resursa r){
        this.r=r;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Am citit: "+r.citeste());
        }
    }
}

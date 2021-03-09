package L3.Ex5;

public class Main {
    public static void main(String args[])	{
        FirCititor fc = new FirCititor();
        FirScriitor fs = new FirScriitor();
        try{
            fc.conect(fs.getPipe());
            fc.start();fs.start();
        }catch(Exception e){e.printStackTrace();}
    }


}

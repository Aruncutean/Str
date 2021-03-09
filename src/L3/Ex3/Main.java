package L3.Ex3;

public class Main {
    public static void main(String[] args){
        JoinTestThread w1 = new JoinTestThread("Fir 1",null);
        JoinTestThread w2 = new JoinTestThread("Fir 2",w1);
        w1.start();

        w2.start();
        //System.out.println("Da");
    }


}

package L1.ex1;

public class Main {

    public static void main(String[] args) {
        Complex nr1 = new Complex(2, 5);
        Complex nr2 = new Complex(4, -1);

        Complex nrSum = nr1.sum(nr2);
        System.out.println(nrSum.getRe() + " + j" + nrSum.getIm());


        Complex nrProd = nr1.prod(nr2);
        System.out.println(nrProd.getRe() + " + j" + nrProd.getIm());
    }

}

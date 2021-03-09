package L1.ex1;

public class Complex {

    private int re;
    private int im;

    Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getIm() {
        return im;
    }

    public int getRe() {
        return re;
    }

    public Complex sum(Complex nr) {
        if (nr != null) {
            return new Complex(this.re + nr.re, this.im + nr.im);

        }
        return null;
    }

    public Complex prod(Complex nr)
    {
        if (nr != null) {
            return new Complex(this.re*nr.re-this.im*nr.im, this.re*nr.im+this.im*nr.re);

        }
        return null;
    }



}

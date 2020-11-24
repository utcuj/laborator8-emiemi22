public class Fractie implements Numeric {
    private double fractie ;

    public Fractie (double x)
    {
        this.fractie = x ;
    }
    @Override
    public Numeric adunare(Numeric x) {
        if (x instanceof Complex)
        {
            Complex a = new Complex(fractie+((Complex) x).getParteReala(),0);
            return a ;
        }
        else
        {
            this.fractie+=((Fractie) x).getFractie();
            return this;
        }

    }

    @Override
    public Numeric scadere(Numeric x) {
        if (x instanceof Complex)
        {
            Complex a = new Complex(fractie+((Complex) x).getParteReala(),0);
            return a ;
        }
        else
        {
            this.fractie-=((Fractie) x).getFractie();
            return this ;
        }
    }

    public double getFractie() {
        return fractie;
    }

    @Override
    public String toString() {
        return "Fractie{" +
                "fractie=" + fractie +
                '}';
    }
}

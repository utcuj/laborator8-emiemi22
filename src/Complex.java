public class Complex implements  Numeric{
    private double parteReala ;
    private double parteImaginara;

    public Complex (double parteReala , double parteImaginara)
    {
        this.parteImaginara = parteImaginara;
        this.parteReala = parteReala;
    }
    public Numeric adunare(Numeric x)
    {
        if (x instanceof Complex)
        {
            this.parteReala += ((Complex) x).parteReala ;
            this.parteImaginara += ((Complex) x).parteImaginara;
        }
        else
        {
            this.parteReala +=((Fractie) x).getFractie();
        }
        return this;

    }

    public Numeric scadere(Numeric x) {
        if (x instanceof Complex)
        {
            this.parteReala -= ((Complex) x).parteReala ;
            this.parteImaginara -= ((Complex) x).parteImaginara;
        }
        else
        {
            this.parteReala -=((Fractie) x).getFractie();

        }
        return this;
    }

    public double getParteReala() {
        return parteReala;
    }

    public void setParteReala(double parteReala) {
        this.parteReala = parteReala;
    }

    public double getParteImaginara() {
        return parteImaginara;
    }

    public void setParteImaginara(double parteImaginara) {
        this.parteImaginara = parteImaginara;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "parteReala=" + parteReala +
                ", parteImaginara=" + parteImaginara +
                '}';
    }
}

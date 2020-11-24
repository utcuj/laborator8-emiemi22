public class Masina1 implements Cloneable {
    private String marca ;
    private String culoare ;
    public Masina1 (String marca , String culoare)
    {
        this.marca = marca ;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void revopsire(String culoare)
    {
        this.culoare = culoare;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

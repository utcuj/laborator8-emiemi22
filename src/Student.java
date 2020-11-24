public class Student implements  Cloneable{
    private String nume  ;
    private  String prenume ;
    private Masina masina ;
    public Student (String nume , String prenume , Masina masina)
    {
        this.nume = nume ;
        this.prenume = prenume;
        this.masina = masina ;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void revopseste(String culoare)
    {
        masina.revopsire(culoare);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", masina=" + masina.getCuloare() +" "+ masina.getMarca()+
                '}';
    }
}

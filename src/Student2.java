public class Student2 implements Cloneable
{
        private String nume  ;
        private  String prenume ;
        private Masina1 masina ;
        public Student2 (String nume , String prenume , Masina1 masina)
        {
            this.nume = nume ;
            this.prenume = prenume;
            this.masina = masina ;
        }

        protected Object clone() throws CloneNotSupportedException{
            Student2 student2 = (Student2)super.clone();
            student2.masina=(Masina1)masina.clone();
            return student2;
        }

        public void revopseste(String culoare)
        {
            masina.revopsire(culoare);
        }

        @Override
        public String toString() {
            return "Student2{" +
                    "nume='" + nume + '\'' +
                    ", prenume='" + prenume + '\'' +
                    ", masina=" + masina.getCuloare() +" "+ masina.getMarca()+
                    '}';
        }
    }


import java.util.Arrays;

public class Main {
    public static void  main (String [] args)
    {
        Persoana[] persoane = new Persoana[5] ;
        persoane[0] = new Persoana("Andrei" , "Popesc2u " , 23);
        persoane[1] = new Persoana("Razvan" , "Pope2scu " , 53);
        persoane[2] = new Persoana("Wilson" , "Pop2e2scu " , 13);
        persoane[3] = new Persoana("Zen" , "Pope3scu " , 45);
        persoane[4] = new Persoana("Cirpian" , "Pope4scu " , 23);

        for (Persoana i : persoane)
        {
            System.out.println(i.toString());
        }
        Arrays.sort(persoane);

        for (Persoana i : persoane)
        {
            System.out.println(i.toString());
        }
    }
}

public class Test {
    public static void main(String[] args)
    {
        Numeric a = new Complex(1 , 2 );
        Numeric b = new Fractie(2.85);
        Numeric d = new Fractie(5.15);
        Numeric c = new Complex(2,5);
        a.adunare(c);
        System.out.println(a.toString());
        a.adunare(b);
        System.out.println(a.toString());
        d.adunare(b);
        System.out.println(d.toString());

        Numeric[][] matrice1 = new Numeric[3][3] ;
        Numeric[][] matrice2 = new Numeric[3][3];

        for (int i=0 ; i<3 ;i++)
        {
            for (int j = 0 ; j< 3 ;j ++)
            {
                matrice1[i][j] = new Complex(i,i);
                matrice2[i][j] = new Fractie(i/(j+1));
            }
        }

        Matrice mat = new Matrice(matrice1);
        Matrice mat1 = new Matrice(matrice2);

        //mat1.adunare(mat);
        mat1.afisare();
    }
}

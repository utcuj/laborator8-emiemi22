public class Matrice {
    private Numeric[][] matrice = new Numeric[3][3];
    public Matrice(Numeric[][] mat)
    {
        this.matrice = mat ;
    }
    public void adunare(Numeric[][] a)
    {
        for ( int i = 0 ;i < 3 ;i++ )
        {
            for (int j = 0 ; j< 3 ; j++)
                this.matrice[i][j].adunare(a[i][j]);
        }
    }
    public void scadere(Numeric[][] a)
    {
        for ( int i = 0 ;i < 3 ;i++ )
        {
            for (int j = 0 ; j< 3 ; j++)
                this.matrice[i][j].scadere(a[i][j]);
        }
    }
    public void afisare()
        {

        for (int i=0 ; i<3 ;i++)
        {
            for (int j = 0 ; j< 3 ;j ++)
            {
               System.out.print(this.matrice[i][j] + " " );
            }
            System.out.println();
        }
    }
}

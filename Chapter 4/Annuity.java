public class Annuity
{
    public static void main(String[] args)
    {
        double pVann;
        double pMT = 10000;
        double i = 0.08;
        double n = 20 - 1;
        double x = Math.pow(1+i,n);
        pVann = pMT * ((((x -1)/i)/x) +1);
        System.out.println((int)pVann);
    }
}
        
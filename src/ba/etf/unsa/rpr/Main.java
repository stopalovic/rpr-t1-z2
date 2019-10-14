package ba.etf.unsa.rpr;
import java.util.Scanner;
public class Main {

    static int SumaCifara(int n)
    {
        int suma=0;
        int cifra=0;
        do{

            cifra=n%10;
            suma+=cifra;
            n/=10;

        }while(n!=0);

        return suma;
    }



    public static void main(String[] args) {

        Scanner ulaz=new Scanner(System.in);
        int n;
        System.out.println("Unesite broj: ");
        n=ulaz.nextInt();
        for(int i=1;i<n;i++)
        {
            if(SumaCifara(i)%i==0) System.out.println(i+" ");
        }

    }
}

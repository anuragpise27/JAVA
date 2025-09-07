import java.math.BigInteger;
import java.util.*;


class pg27
{
    public static void main(String A[])
    {
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("eneter the value : ");
        int iValue = sobj.nextInt();

         BigInteger iFact = BigInteger.ONE;
        int i = 0;
        
        for(i = 1; i <= iValue; i++)
        {
            iFact = iFact.multiply(BigInteger.valueOf(i));
        }
       

       
        System.out.println("Factrorial : "+iFact);

    }
}
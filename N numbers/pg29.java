import java.math.BigInteger;
import java.util.*;

class Numbers
{
    public BigInteger Fact(int iNo)
    {
        BigInteger iFact = BigInteger.ONE;
        int i = 0;
        
        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact.multiply(BigInteger.valueOf(i));
        }
        return iFact;
    }
}

class pg29
{
    public static void main(String A[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("eneter the value : ");
        int iValue = sobj.nextInt();

         BigInteger iFact = BigInteger.ONE;
        int i = 0;
        
        for(i = 1; i <= iValue; i++)
        {
            iFact = iFact.multiply(BigInteger.valueOf(i));
        }
       

       BigInteger iRet = nobj.Fact(iValue);
        System.out.println("Factrorial : "+iRet);

    }
}
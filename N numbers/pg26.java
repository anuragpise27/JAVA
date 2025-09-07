
import java.util.*;

class Numbers
{
    public int Factorial(int iNo)
    {
        long iFact = 1;
        int i = 0;
        
        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }
        return  (int )iFact;
    }
}

class pg26
{
    public static void main(String A[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("eneter the value : ");
        int iValue = sobj.nextInt();

        long iRet = nobj.Factorial(iValue);
        System.out.println("Factrorial : "+iRet);

    }
}
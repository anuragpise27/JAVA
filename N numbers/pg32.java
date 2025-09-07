import java.util.*;

class Numbers
{
    public long Factorial(int iNo)
    {
        long ifact = 1;
        int i = 0;

        for(i = iNo ; i >= 1; i--)
        {
            ifact = ifact * i;
        }
        return ifact;
    }
}


class pg32
{
    public static void main(String a[])
    {

        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value  :  ");
        int iValue = sobj.nextInt();

        long iRet = nobj.Factorial(iValue);
        if(iValue < 0)
        {
            System.out.println("Invalid ");
        }
        else
        {
            System.out.println("Fact : "+ iRet);
        }


    }
}    
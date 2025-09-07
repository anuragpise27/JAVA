import java.util.*;


class Numbers
{
    public int Factorial(int iNo)
    {
       

        long iFact = 1;
        for(int i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }
        return (int)iFact;
    }
}

class pg28
{
    public static void main(String a[])
    {

        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value  :  ");
        int iValue = sobj.nextInt();

        int iRet = nobj.Factorial(iValue);
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
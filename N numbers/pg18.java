import java.util.*;

class Numbers
{
    public int SumOfIntergers(int iNo)
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i<= iNo; i++)
        {
            iSum = iSum + i;
        }

        return iSum;
    }
}

class pg18
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        int iValue = sobj.nextInt();

        int iRet = nobj.SumOfIntergers(iValue);
        System.out.println("Addition is :"+ iRet);

    }
}
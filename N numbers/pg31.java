import java.util.*;


class Numbers
{
    public long Factorial(int iNo)
    {
       
        
        long iFact = 1;
        int iCnt = 1;
        while(iCnt <= iNo)
        {
            iFact = iFact * iCnt;
            iCnt++;
        }
        return iFact;
    }
}

class pg31
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
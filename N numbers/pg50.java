import java.util.*;

class Digits
{
    public int CountSumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit  = iNo % 10;
           
            iSum = iSum + iDigit;
           
            iNo  = iNo / 10;
        }
        
        return iSum;
    }
}


class pg50
{
    public static void main(String a[])
    {
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr Numbers :");
        int iValue = sobj.nextInt();
        
        int iRet = dobj.CountSumOfDigits(iValue);
        System.out.println("Even Counts : "+iRet);
    }
}
import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            
            iCount ++;
            iNo  = iNo / 10;
        }
        return iCount;
    }
}


class pg48
{
    public static void main(String a[])
    {
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr Numbers :");
        int iValue = sobj.nextInt();
        
        int iRet = dobj.CountDigits(iValue);
        System.out.println("Counts : "+iRet);
    }
}
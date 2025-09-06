import java.util.*;

class Numbers
{
    public int Summation(int iNo)
    {
        int i = 0;
        int iSum = 0;
        for (i = 1; i <= iNo; i++)
        {
            iSum = iSum + i;
        }
        return iSum;
    }
}

class pg25
{
    public static void main(String a[])
    {
        int  iRet = 0;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Eneter the value :");
        int iValue = sobj.nextInt();

        iRet = nobj.Summation(iValue);
        
        System.out.println("Summation : "+iRet);

            
      
    }
}
import java.util.*;

class Numbers
{
    public int DisplayEvenFactors(int iNo)
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iSum +=i;
                System.out.println(i);
            }
           
        }
        return iSum;
        
    }
}


class pg38
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int iValue = sobj.nextInt();

       int iRet =  nobj.DisplayEvenFactors(iValue);
       System.out.println("Sum of Factors :"+ iRet);
       

    }
}
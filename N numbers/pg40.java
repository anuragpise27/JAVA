import java.util.*;

class Numbers
{
    public boolean ChkPrime(int iNo)
    {
        int i = 0;
      
        boolean bFlag = true;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        

        for(i = 2; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                bFlag = false;
                break;
               
            }
           
        }
       return bFlag;
    }
}


class pg40
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int iValue = sobj.nextInt();

       boolean iRet =  nobj.ChkPrime(iValue);

       if(iRet == true)
       {
        System.out.println(iValue+" is a Prime Number");
       }
       else
       {
        System.out.println(iValue+" is Not Prime Number");
       }
       
       

    }
}
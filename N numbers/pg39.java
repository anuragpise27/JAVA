import java.util.*;

class Numbers
{
    public boolean ChkPerfect(int iNo)
    {
        int i = 0;
        int iSum = 0;
        

        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iSum +=i;
               
            }
           
        }
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}


class pg39
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int iValue = sobj.nextInt();

       boolean iRet =  nobj.ChkPerfect(iValue);

       if(iRet == true)
       {
        System.out.println(iValue+" is a Perfect Number");
       }
       else
       {
        System.out.println(iValue+" is Not Perfect Number");
       }
       
       

    }
}
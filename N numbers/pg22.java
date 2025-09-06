import java.util.*;

class Numbers
{
    public boolean ChkEven(int iNo)
    {
        return (iNo % 5 == 0);
    }
}

class pg22
{
    public static void main(String a[])
    {
        boolean  bRet = false;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Eneter the value :");
        int iValue = sobj.nextInt();

        bRet = nobj.ChkEven(iValue);
        
        if(bRet == true)
        {
            System.out.println("yes\n");
        }
        else 
        {
            System.out.println("No\n");
        }

            
      
    }
}
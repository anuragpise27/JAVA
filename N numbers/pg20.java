import java.util.*;

class Numbers
{
    public boolean ChkEven(int iNo)
    {
        boolean bValue = false;
        if(iNo % 2 == 0)
        {
            bValue = true;
        }
        else 
        {
            bValue = false;
        }
        return bValue;
    }
}

class pg20
{
    public static void main(String a[])
    {
        boolean bRet = false;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Eneter the value :");
        int iValue = sobj.nextInt();

        bRet = nobj.ChkEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" Numbers is Even..");
        }
        else
        {
            System.out.println(iValue+"Number is Odd..");
        }


    }
}
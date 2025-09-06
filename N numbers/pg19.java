import java.util.*;

class Numbers
{
    public boolean ChkEven(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

class pg19
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
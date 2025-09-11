import java.util.*;

class Digits
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        int i  = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class pg46
{
    public static void main(String a[])
    {
       // Scanner sobj = new Scanner(System.in);
       Digits dobj = new Digits();
       dobj.DisplayDigits(56789547);

    }
}
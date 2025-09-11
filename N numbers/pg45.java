import java.util.*;



class pg45
{
    public static void main(String a[])
    {

        //Scanner sobj = new Scanner(System.in);
        int iNo = 751;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

    }
}
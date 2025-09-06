import java.util.*;

class Numbers
{
    public void Display(int iNo)
    {
       for(int iCnt = 0; iCnt <= iNo; iCnt++)
       {
        System.out.println("| Hello...| "+ iCnt);
     
       }
    }
}


class pg15
{
    public static void main(String args[])
    {
        int iValue = 0;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Ebter the Value : ");
        iValue = sobj.nextInt();

        nobj.Display(iValue);

        sobj.close();
    }
}
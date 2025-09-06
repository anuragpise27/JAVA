import java.util.*;

class Numbers
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<= iNo;iCnt++)
        {
            System.out.println("\n"+iCnt);
        }

    }
}


class pg16
{
    public static void main(String args[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the value : ");
        int iValue = sobj.nextInt();

        nobj.Display(iValue);


    }
}
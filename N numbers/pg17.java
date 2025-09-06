import java.util.*;

class Numbers
{
    public void DisplayReverse(int iNo)
    {
        int i = 0;

        for(i = iNo; i>=0; i--)
        {
            System.out.println("\n"+ i);
        }
    }
}

class pg17
{
    public static void main(String args[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("neter the value : ");
        int iValue = sobj.nextInt();

        nobj.DisplayReverse(iValue);

    }
}
import java.util.*;


class Numbers
{
    public void DisplayFactors(int iNo)
    {
        int i = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class pg33
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        nobj.DisplayFactors(iValue);

    }
}
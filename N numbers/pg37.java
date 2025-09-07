import java.util.*;

class Numbers
{
    public void DisplayEvenFactors(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0 && i % 2 == 0)
            {
                System.out.println("Factors :"+i);
            }
           
        }
        
    }
}


class pg37
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int iValue = sobj.nextInt();

        nobj.DisplayEvenFactors(iValue);
       

    }
}
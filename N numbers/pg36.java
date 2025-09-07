import java.util.*;

class Numbers
{
    public void DisplayFactorsAndNonFActors(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            if(iNo % i == 0)
            {
                System.out.println("Factors :"+i);
            }
            
            
        }
        for(i = 1; i <= iNo; i++)
        {
            
             if(iNo % i != 0)
            {
                System.out.println("Non FActors :"+i);
            }
            
        }
    }
}


class pg36
{
    public static void main(String a[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int iValue = sobj.nextInt();

        nobj.DisplayFactorsAndNonFActors(iValue);
       

    }
}
/*
    Start
        Accept age from user
            If age is less than 5 then there will no ticket
            If it is in between 5 to 18 then it will be 700
            It it is in betwween 18 to 50 it will be 999
            And if it is greater than 50 then it will be 500
    Stop
*/
import java.util.*;

class Numbers
{
    public int Display(int iNo)
    {
        int Price  = 0;

        if(iNo <= 5)
        {
          Price = 0;
        }
        else if(iNo >= 5 && iNo <= 18)
        {
            Price = 999;
        }
        else if(iNo >= 18 && iNo <= 50)
        {
           Price = 700;
        }
        else if(iNo >= 50)
        {
           Price = 599;
        }

        return Price;
    }
}

class pg9
{
    public static void main(String args[])
    {
        int iAge = 0;
        int iRet = 0;

        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENetr the Age : ");
        iAge = sobj.nextInt();

        iRet = nobj.Display(iAge);

        System.out.println("Price :"+ iRet);


        sobj.close();
    }
}
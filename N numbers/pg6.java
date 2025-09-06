/*
    Start
        Accept percentage from user
            If percentage is less than 0 and greater than 100
                Display as invalid input
            If percentage is greater than 0 and less than 35
                Display as fail
            If percentage is greater than 35 and less than 50
                Display as Pass class
            If percentage is greater than 50 and less than 60
                Display as second class
            If percentage is greater than 60 and less than 70
                Display as first class
            If percentage is greater than 70 and less than 100
                Display as first class with distinction
    Stop
*/
import java.util.*;

class Numbers
{
    public void DisplayClass(float per)
    {
        if(per <= 0 || per >= 100.0f)
        {
            System.out.println("invalid input\n");
        }
        else if(per > 0.0f && per <= 35.0f)
        {
            System.out.println("Fail");
        }
        else if(per >= 35.0f && per <= 50.0f)
        {
            System.out.println("Pass");
        }
        else if(per >= 50.0f && per <= 60.0f)
        {
            System.out .println("Second Class");
        }
        else if(per >= 60.0f && per <= 70.0f)
        {
            System.out.println("First Class");
        }
        else if(per >= 70.0f && per <= 100.0f)
        {
            System.out .println("Distinction");
        }
    }
}

class pg6
{
    public static void main(String args[])
    {
        float Percentage = 0.0f;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Percentage :");
        Percentage = sobj.nextFloat();

        nobj.DisplayClass(Percentage);

        sobj.close();

    }
}
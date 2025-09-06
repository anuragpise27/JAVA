///////////////////////////////////////////////////////
//
//  File name :     pg.java
//  Descreption :   Used to calculate percentage
//  Author :        Anurag Sanjay Pise
//  Date :          09/05/2025
//
///////////////////////////////////////////////////////


import java.util.*;


class pg4
{
    public static void main(String args[])
    {
       
        Scanner sobj = new Scanner(System.in);
        int iTotal = 0;
        int iObtained = 0;
        float fRet = 0.0f;

        System.out .println("enter the Obtained marks : ");
        iObtained = sobj.nextInt();

        System.out.println("Enter the Total  marks");
        iTotal = sobj.nextInt();

        fRet = ((float)iObtained /(float) iTotal) * 100;

        

       
        System.out.println("Percentage is :" + fRet);

        sobj.close();
    }
}
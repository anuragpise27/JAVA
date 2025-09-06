///////////////////////////////////////////////////////
//
//  File name :     pg.java
//  Descreption :   Used to calculate percentage
//  Author :        Anurag Sanjay Pise
//  Date :          09/05/2025
//
///////////////////////////////////////////////////////


import java.util.*;

 class Numbers
{
    public float Percentage(int iNo1,int iNo2)
    {
        float Per = 0.0f;

        Per = ((float)iNo1 /(float) iNo2) * 100;

        return Per;
    }

}

class pg3
{
    public static void main(String args[])
    {
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);
        int iTotal = 0;
        int iObtained = 0;
        float fRet = 0.0f;

        System.out .println("enter the Obtained marks : ");
        iObtained = sobj.nextInt();

        System.out.println("Enter the Total  marks");
        iTotal = sobj.nextInt();

        fRet = nobj.Percentage(iObtained,iTotal );

       
        System.out.println("Percentage is :" + fRet);

        sobj.close();
    }
}
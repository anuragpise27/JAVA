///////////////////////////////////////////////////////
//
//  File name :     pg.java
//  Descreption :   Used to calculate percentage
//  Author :        Anurag Sanjay Pise
//  Date :          09/05/2025
//
///////////////////////////////////////////////////////


class pg2
{
    public static void main(String args[])
    {
        int  iTotal = 400;
        int  iObtained  = 300;
        float fPercentage = 0.0f;

        fPercentage = ((float)iObtained / (float)iTotal) * 100;

        System.out.println("Percentage :\n"+fPercentage);
    }
}
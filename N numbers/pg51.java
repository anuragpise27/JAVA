import java.util.Scanner;

class Digits
{
    public int iNo1;
    public int iNo2;

     Digits()
    {
        System.out.println("inside Default ");
        iNo1 = 0;
        iNo2 = 0;
    }

     
     Digits(int A,int B)
    {
        System.out.println("inside Parameterize ");
        this.iNo1 = A;
        this.iNo2 = B;
    }
     int CountSum()
    {
        int iDigit = 0;
        int iSum = 0;

        while(this.iNo1 != 0)
        {
            iDigit  = this.iNo1 % 10;
           
            iSum = iSum + iDigit;
           
           this.iNo1  = this.iNo1 / 10;
        }
        
        return iSum;
    }
    int Addtion()
    {
        return this.iNo1 + this.iNo2;
    }
}

class pg51
{
    public static void main(String a[])
    {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr Numbers :");
        int iValue1 = sobj.nextInt();
        System.out.println("Enetr Numbers :");
        int iValue2 = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.Addtion();
        System.out.println(iRet);

       

       

    }
}
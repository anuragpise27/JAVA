import java.util.*;

class Numbers
{
    public boolean ChkDivisiBy3And4(int iNo)
    {
        return ((iNo % 5 == 0) && (iNo % 3 == 0));
    }
}

class pg23
{
    public static void main(String a[])
    {
        boolean  bRet = false;
        Numbers nobj = new Numbers();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Eneter the value :");
        int iValue = sobj.nextInt();

        bRet = nobj.ChkDivisiBy3And4(iValue);
        
        if(bRet == true)
        {
            System.out.println("yes\n");
        }
        else 
        {
            System.out.println("No\n");
        }

            
      
    }
}
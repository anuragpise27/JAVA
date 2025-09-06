class Numbers
{
    public void Display()
    {
       for(int iCnt = 0; iCnt<=4; iCnt++)
       {
        System.out.println("hello...");
       }
    }
}

class pg11
{
    public static void main(String args[])
    {
        Numbers nobj = new Numbers();

        nobj.Display();
    }
}
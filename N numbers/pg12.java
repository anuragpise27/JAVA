class Numbers
{
    public void Display()
    {
       for(int iCnt = 0; iCnt<=4; iCnt++)
       {
        System.out.println(iCnt+"\n");
       }
    }
}

class pg12
{
    public static void main(String args[])
    {
        Numbers nobj = new Numbers();

        nobj.Display();
    }
}
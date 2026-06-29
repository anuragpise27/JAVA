
class node
{
    public int data;
    public node next;
}
class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    { 
        first = null;
        iCount = 0;
    }
    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new  node();

        newn.data = no;
        newn.next = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;

    }

    public void InsertLast(int no)
    {
        node newn = null;
        node temp = null;
        newn = new node();

        newn.data = no;
        newn.next = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            temp = first;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
        }
    
        iCount--;
    }
    public void DeleteLast()
    {
        node temp = null;

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            temp = first;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
            
        }
    
        iCount--;
    }

    public void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public int Count()
    {
        return iCount;
    }

    public void InsertAtPos(int no , int pos)
    {
        node newn = null;
        node temp = null;

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            newn = new node();
            newn.data = no;
            newn.next = null;
            temp = first;
            for(int i = 1;i < pos - 1;i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            
            iCount++;
        }
    }
    public void DeleteAtPos( int pos)
    {
        node temp = null;

        if(pos < 1 || pos > iCount+1)
        {
            System.out.println("invalid");
            return;
        }
        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount+1)
        {
            DeleteLast();
        }
        else
        {
            temp = first;
            for(int i = 1;i < pos - 1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            
            
            iCount--;
        }
    }
}

class ds2
{
    public static void main(String a[]) 
    {
        int iRet = 0;
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(11);
        sobj.InsertFirst(12);
        sobj.InsertFirst(13);
        sobj.InsertFirst(14);


        sobj.InsertLast(90);

        
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println(iRet);

       
        sobj.DeleteAtPos( 3);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println(iRet);

 

    }
}
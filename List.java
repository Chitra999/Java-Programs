import java.util.*;
class List
{
    //basic to enter data accordingly one after another node
    public static Node Create(Node start)
    {
        Node p,q;
        start= null;
        String reply;
        Scanner in=new Scanner(System.in);
        //no matter what atleast one node will be created
        do
        {
            p=new Node();//taking the input material from user in this node but temporarily
            p.input();
            if(start==null)
            {
                start=p;                            //now a base address of the node in p is referenced to start
            }
            else
            {
                for(q=start;q.link!=null;q=q.link); //q value will be changed from the base address of the first node to last node
                q.link=p;                          //in that last node with link having null value will be changed and referred 
            }                                      //to the base adress of the last node that is to be added 
            System.out.println("Wish to add more nodes y/n");
            reply=in.next();
        }while(reply.equalsIgnoreCase("y"));
        return(start);                             //returns the base address of the first node in the series
    }
    
    public static void display(Node start)
    {
        Node q;
        System.out.println("content of list");
        for(q=start;q!=null;q=q.link)             //q!=null helps us to iterate to the last node
        {
            q.output();
        }
    }
    
    public static Node addLast(Node start)
    {
        Node p,q;
        p=new Node();
        if(start==null)
        {
            start= p;
        }
        else
        {
            for(q=start;q.link!=null;q=q.link)
            {
            }
            q.link=p;
        }
        return(start);
    }

    public static void main()
    {
        Node start=null;
        start=Create(start);
        display(start);
    }
}
     
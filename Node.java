import java.util.*;
class Node
{
    int num;
    Node link;
    
    public Node()
    {
        num=0;
        link=null;
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter data");
        num=in.nextInt();
    }
    public void output()
    {
        System.out.println(num);
    }
}  
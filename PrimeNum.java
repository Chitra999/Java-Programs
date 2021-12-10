import java.util.*;
class PrimeNum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, i, c=0;
        n = in.nextInt();
        
        for(i = 1; i<=n; i++)
        {
            if(n%i==0)
            c++;
        }
        
        
        
        if(c==2)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number");
        
    }
}
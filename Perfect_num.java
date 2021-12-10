import java.util.*;
class Perfect_num
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, i, s = 0;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
            s = s + i;
        }
        
        if(s == n)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a perfect Number");
    }
}
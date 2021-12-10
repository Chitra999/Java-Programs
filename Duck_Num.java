import java.util.*;
class Duck_Num
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, c = 0, d;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        while(n > 0)
        {
            d = n % 10;
            
            if(d == 0)
            c++;
            
            n = n / 10;
        }
        
        if(c != 0)
        System.out.println("Duck Number");
        else
        System.out.println("Not a Duck Number");
    }
}
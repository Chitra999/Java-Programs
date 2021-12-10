import java.util.*;
class Armstrong
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int num, n, d, s=0;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        num = n;
        
        while(n > 0)
        {
            d = n % 10;
            s = s + (d*d*d);
            n = n / 10;
        }
        
        if(s == num)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not a Armstrong Number");
    }
}
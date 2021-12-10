import java.util.*;
class Niven_Num
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int n, d, s = 0;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        while(n > 0)
        {
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        
        if(n % s == 0)
        System.out.println("Niven number");
        else
        System.out.println("Not a niven number");
    }
}
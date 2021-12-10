import java.util.*;
class Gold_num
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, i, s = 0, c = 0, d;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        while(n > 0)
        {
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        
        for(i = 1; i <= s; i++)
        {
            if(s % i == 0)
            c++;
        }
        
        if(c == 2)
        System.out.println("Gold Number");
        else
        System.out.println("Invalid Number");
    }
}
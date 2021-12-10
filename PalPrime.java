import java.util.*;
class PalPrime
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, i, num, rev = 0, d, c = 0;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        num = n;
        for(i = 1; i<= n; i++)
        {
            if(n % i ==0)
            c++;
        }
        while(n > 0)
        {
            d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        
        if(num == rev && c == 2)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a palindrome number");
    }
}
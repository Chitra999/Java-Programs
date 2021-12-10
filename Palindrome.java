import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n, num, rev = 0, d;
        
        System.out.println("Enter any number");
        n = in.nextInt();
        
        num = n;
        
        while(n > 0)
        {
            d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        
        if(num == rev)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a palindrome number");
    }
}
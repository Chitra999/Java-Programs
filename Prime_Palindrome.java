import java.util.*;
class Prime_Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n, rev = 0, x;

        n = in.nextInt();
        x = n;
        for(int i = 0; i <=n; i++)
        {
            if (rev!=n)
            rev = rev*10 + (x%10);

            x/=10;
        }

        System.out.println(rev);
    }
}

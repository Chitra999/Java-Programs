import java.util.*;
class Buzz_Num
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int n, num, d, s = 0;
        
        System.out.println("Enter any number");
        n = in.nextInt();
       
        if(n % 7 == 0 || n % 7 == 7)
        System.out.println("Buzz number");
        else
        System.out.println("Not a Buzz number");
    }
}
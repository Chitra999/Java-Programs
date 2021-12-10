import java.util.*;
class Cyclo_Num
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n;
        Cyclo_Num cyclo = new Cyclo_Num();
        System.out.println("Enter any number");
        cyclo.CycloNum(n = in.nextInt(), true);
    }
    
    public void CycloNum(int n, boolean p)
    {
        int fd, ld, c = 0;
        
        ld = n % 10;
        fd = n;
        while(fd > 9)
        {
            c++;
            fd = fd / 10;
        }
        
        if(fd == ld)
        System.out.println("Cyclo Number");
        else if(p)
        System.out.println("Not a acyclo Number");
    }
}
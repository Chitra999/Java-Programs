public class ConvertRecur
{
    public static int recToOct(int n)
    {
        if(n==0)
        return 0;
        return ((recToOct(n/8)*10)+n%8);
    }
    
    public static String DtoW(int n)
    {
        String dgt[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(n>0)
        {
            return(DtoW(n/10)+""+dgt[n%10]);
        }
        else
        {
            return "";
        }
    }
    
    public static void convert_toOctal(int num)
    {
        if(num>8)
        {
            convert_toOctal(num/8);
        }
        System.out.println(num%8);
    }
    
    public static long recToBinary(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return((long)(recToBinary(n/2)*10)+(n%2));
    }
    
    public static String recToHex(int n)
    {
        String dgt[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        if(n==0)
        {
            return("");
        }
        return(recToHex(n/16)+dgt[n%16]);
    }
}
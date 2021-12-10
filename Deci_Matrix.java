import java.util.*;
class Deci_Matrix
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int M,N;
        System.out.println("Enter M(no. of rows) and N(no. of columns)");
        System.out.print("M=");
        M=in.nextInt();
        System.out.print("N=");
        N=in.nextInt();
        
        if((M<=0 && M>=10)||(N<=2 && N>=6))
        {
            System.out.println("IVALID INPUT");
        }
        else
        {
            
            int A[][]=new int[M][N];
            System.out.println();
            //REVERSING THE INPUT AND USING % TAKING OUT THE FIRST NO. TO BE INSERTED FROM 'a' 
            int rev=0;
            for(int i=1; i<=M; i++)
            {
                System.out.print("ENTER ELEMENTS FOR ROW "+i+":");
                int a=in.nextInt();
                for(int j=0;j<N;j++)
                {
                    rev= rev*10+a%10;
                    a=a/10;
                }
                for(int j=0;j<N;j++)
                {
                    A[i-1][j]= rev%10;
                    rev=rev/10;
                }      
            }
            //DISPLAYING ORIGINAL MATRIX
            System.out.println("FILLED MATRIX \t DECIMAL EQUIVALENT");
            for(int i=0;i<M;i++)
            {
                double s=0;
                for(int j=0;j<N;j++)
                {
                    System.out.print(A[i][j]+" ");
                    s=s+(A[i][j]*(Math.pow(8,N-(j+1))));
                }
                System.out.print("\t\t  "+s);
                System.out.println();
            }
        }
    }
}
        
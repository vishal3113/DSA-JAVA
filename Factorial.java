import java.util.*;



public class Factorial {

    public static int fact(int n){
        int fac=1;
            // Scanner sc=new Scanner(System.in);
            
            // System.out.print("Enter the number to get the facitorial:");
            // int Num=sc.nextInt();
    
            for(int i=2;i<=n;i++){
                fac*=i;
            }
            return fac;
    }

    public static int binomialCoff(int n,int r){

        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);

        int bin=a/(b*c);

        return bin;
        
    }

    public static void main(String args[])
    {   
        
        System.out.println(fact(6));
        System.out.println(binomialCoff(5, 4));
    }    
}

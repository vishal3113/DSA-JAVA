package Recursion;

public class Recursion {

    public static void R1(int n){
        if(n==0){
            return;
        }
        // Decrease Function
        System.out.println(n);
        R1(n-1);
    }

public static void R2(int n){
    int count=1;
        if(n==count){
            return;
        }
        // Decrease Function
        System.out.println(n);
        R1(n+1);
    }

    public static void main(String[] args) {
        Recursion obj=new Recursion();
        obj.R1(4);
    }
}

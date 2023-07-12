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
    if(n==0){
            return;
        }
        // Increase Function
        R2(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Recursion obj=new Recursion();
        obj.R2(4);
    }
}

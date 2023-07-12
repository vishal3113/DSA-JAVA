package Function_overloading;
// Concept of Function Overloading 

public class F1 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(5,6));
        System.out.println(sum(5,6,9));
    }
    
}

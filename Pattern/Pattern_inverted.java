import java.util.*;

public class Pattern_inverted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Lines You Want to Print inverted Stars: ");
        int ln=sc.nextInt();
        for(int line=1;line<=ln;line++){
            for(int row=1;row<=ln-line+1;row++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

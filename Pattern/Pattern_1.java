package Pattern;
import java.util.Scanner;

public class Pattern_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lines Your want wo print *: ");
        int line=sc.nextInt();

        for(int l=1;l<=line;l++){
            for(int star=1;star<=l;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Multiply_table {
    public static void main(String args[]){
        int tab=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to Print the table");
        int Num=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(Num +"*"+i+"="+Num*i );
        }
    }
}

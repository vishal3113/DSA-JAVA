import java.util.*;

public class Calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number 1:");
    int a =sc.nextInt();
    System.out.println("Enter the Number 2:");
    int b=sc.nextInt();
    System.out.println("Enter the operator You want to use:");
    char operator=sc.next().charAt(0);

    switch(operator){
      case '+': System.out.println(a+b);
                break;
      case '-': System.out.println(a-b);
                break;
      case '*': System.out.println(a*b);
                break;
      case '/': System.out.println(a/b);
                break;
    }
  }
}

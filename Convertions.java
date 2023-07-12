import java.util.*;
// Worked with both the functions with time complexity O(n^2)

public class Convertions {
    public static void DTB(int num){
        // Decimal to Binary
        int pow=0;
        int binnum=0;
        while(num>0){
            int rem=num%2;
            binnum=binnum+rem*(int)Math.pow(10,pow);
            pow++;
            num=num/2;
        }
        System.out.println(binnum);
    }

    public static void BTD(int num){
        // binary to Decimal
        int MyNum=num;
        int pow=0;
        int currentNumber=0;
        while(num>0){
            int ld = num%10;
            currentNumber=currentNumber+(ld*((int)Math.pow(2,pow)));
            pow++;
            num=num/10;
        }
        System.out.println(currentNumber);
    }

    public static void main(String args[]){
        //  BTD(111);
        DTB(7);
    }
}

package Array;

public class Largest_Smallest{
    
    public static int getlargest(int numbers[]){

        int largest=Integer.MIN_VALUE;
        // Way to - Infinity
        
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static int getsmallest(int numbers[]){
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }

    // Main Class
    public static void main(String args[]){

        int numbers[]={12,232,43,90,67};
        System.out.println("largest Number is"+getlargest(numbers));
        System.out.println("Smallest Number is"+getsmallest(numbers));

    }
}
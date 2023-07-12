package Array;

public class Pairs_Array {
    public static void pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void Subarrays(int arr[]){
    int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    // used only for the printing of the subarrays
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of Subarrays: "+tp);
    }

    

    public static void Subarray_sum_prefix(int arr[]){
        // prefix method to apply subarray sum
        // Time Complexity is n^2
        // Sum calculator for prefix array
        int maxSum=Integer.MIN_VALUE;
        int curr=0;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                curr= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<curr){
                    maxSum=curr;
                }
            }

        }

        System.out.println(maxSum );


    }

    public static void Subarrays_sum(int arr[]){
        // Brute Method to find this
        int current=0,maxSum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                current=0;
                // Reinitialliz
                for(int j=i;j<arr.length;j++){
                    // Current Element
                    current+=arr[j];
                    System.out.println(current);
                    if(maxSum<current){
                        maxSum=current;
                    }   
                    else if(current<0){
                        current=0;
                    }
        }
    }
    System.out.println("Total  " + maxSum);
}

    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        // pair(arr);
        // Subarrays(arr);    
        Subarrays_sum(arr);    
        // Subarray_sum_prefix(arr);
    }
}

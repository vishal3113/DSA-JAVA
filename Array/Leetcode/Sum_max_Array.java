package Array.Leetcode;

import java.util.Arrays;

public class Sum_max_Array {

    // static int sum(int arr[],int dp[]){
    //     // approach 1st by using libraries
               
    //    // dp[i] := max sum subarray ending w/ i.
    // int[] dp = new int[nums.length];

    // dp[0] = nums[0];
    // for (int i = 1; i < nums.length; ++i)
    //   dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);

    // return Arrays.stream(dp).max().getAsInt();
    // }



    static int sum2(int arr[]){
        // Approach 2nd using iteration method
        if(arr==null || arr.length == 0){
            return 0;
        }
        int currentsum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            // if(max<arr[i]){
            // currentsum=arr[i]+arr[i-1];
            currentsum= Math.max(arr[i], currentsum+arr[i]);
            max= Math.max(max, currentsum);
            // }


            // assign current and max sum to a[0];  

            // condition:
                // 1- calculate currentsum by 1 dec and current one 
                // 2- calculate max between max and currentsum
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        // int dp[]=new int[arr.length];
        System.out.println(sum2(arr));
    }
}

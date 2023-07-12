package Array.Leetcode;
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// -------------------
// Summarized:-

    // we are traversal from left to right to search the element or target
    // if found return 2 either return 1.
public class search_insert_position {

    static int search_arr(int arr[],int target){
        int l=0;
        int r=arr.length;
        

        while(l<r){
            int m=(l+r)/2;
            if(arr[m]==target){
                return 2;
            }
            if(arr[m]<target){
                l=m+1;
            }
            else{
                r=m;
            }
        }

        return 1;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int target=6;

        System.out.println(search_arr(arr, target));

        
    }
}

package Sorting;
import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class Sorting {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Selection(int arr[]){
        // We Assuming 1st Element as the smallest position in the Array
        // In Inner Loop We're Comparing rest of the array with minposition
        // When We get the minpos the we will swapping that element with the arr[i].
        for(int i=0;i<arr.length-1;i++){
         int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // Swap the Element
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        // Dry Run in the 
        // logic of Selection Sort -
    }


    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int previous=i-1;       
            while(previous>=0 && arr[previous]>curr){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=curr;
        }
    }
    // Count Sort
    // Basically used for the smallest numbers 
    public static void countsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Integer.max(largest, arr[i]);
        }
        
        int count[]=new int[largest+1];
        // +1 becasue we're starting from 0.

        // Checking the Frequecy of the array
        // by orignal Array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // Sorting the Frequency Array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                // TRaverse till the count of the element got 0;
                // count of the element throught the orignal array.
                arr[j]=i;
                j++;
                count[i]--;
            }
        }



    }

    // Print Funtions

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print (arr[i]+ "  ");
        }
    }
    
    public static void main(String args[]){
        
        // Bubble_Sort obj=new Bubble_Sort();
        int arr[]={5,4,1,3,2};
        // bubblesort(arr);
        // Selection(arr);
        // Insertion(arr);
        // IN-built Sort
        // Arrays.sort(arr,Collections.reverseOrder());
        // Use For the Descending order
        // USe Integer instead of int
        countsort(arr);
        print(arr);
    }
}

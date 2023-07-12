package Sorting;

public class Questions {

    // All the Program are for descending Order Only*

    public static int[] bubblesort(int arr[]){
        // bubble sort in Desc
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            // Assuming it is the minimum element in that array

            // Inner Loop Start
            for(int j=i+1;j<arr.length;j++){
                // Check the minpos element with the unsorted part
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }
            // Swapping with the minpos present in unsorted array
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void Insertionsort(int arr[]){
        // -----------
    }

    public static void countsort(int arr[]){
        
    }

    public static void print(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};

        // bubblesort(arr);
        // Working

        selectionsort(arr);
        // Working

        // Call print
        print(arr);
    }
}

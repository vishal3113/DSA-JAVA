package Array;

public class LinearSearch {
    public static int Search(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

        public static void main(String args[]){
        int arr[]={12,43,67,43,89};
        int key=89;

        int index= Search(arr, key);
        for(int i=0;i<arr.length;i++){
            System.out.print("Index at"+index);
        }
    }
}

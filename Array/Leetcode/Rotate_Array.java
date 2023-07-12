

public class Rotate_Array {

    public static void reverse(int arr[]){
        int first=0;
        int last = arr.length-1;

        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last++;
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int count=0;
        int temp1[]=new int[arr.length];
        int temp2[]=new int[arr.length];

        for(int i=arr.length-1;i>=k;i--){
            temp2[i]=arr[i];
            
        }
        reverse(temp2);
        for(int i=0;i<arr.length-k-1;i++){
            temp1[i]=arr[i];
        }        
        reverse(temp1);

        
    }
}

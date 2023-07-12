public class merge_sorted {
    public static void main(String args[]){
        int arr1[]={1,2,3,0};
        int arr2[]={2,5,6};
        int n=4;
        // for first array
        int m=3;
        int j=n-1;
        int i=m-1;
        int k=n+m-1;
        // .for last array

        while(j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k--] = arr2[i--];
            }
            else{
                arr2[k--] = arr1[j--];
            }
            System.out.println(arr1[i]);
        }


    }
}

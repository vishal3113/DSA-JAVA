package Questions.Array;

public class Assignment {
    public static int Q1(int arr[]){
        // on working
        // if arr has a value twice func will return true either false
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return 1;
                    
                }
              
            }
        }
      return 0;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,9,6,7,10,1};
        System.out.println(Q1(arr));
    }
}

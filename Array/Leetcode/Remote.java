package Array.Leetcode;

public class Remote {

        static int remove_duplicates(int arr[]){
            

        int count=0;

            for(int i=0;i<arr.length;i++){
                if(i<arr.length-1 && arr[i]==arr[i+1]){
                    continue;
                }
                arr[count]=arr[i];
                count++;
            }
        //    System.out.println(count);
        return count;

        }



        public static void main(String args[]){
            int arr[]={1,2,2,3,3,4,4,5,5,6};

            System.out.println(remove_duplicates(arr));
        }
}   

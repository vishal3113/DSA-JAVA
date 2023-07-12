public class DiagonalSum {

    public static int Sum(int arr[][]){
        
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static boolean search_lb(int arr[][]){

        // Method 1 using by left and bottom - row

        int key=110;
        int row=0, col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println("Key Found");
                return true;
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }


        System.out.println("Key Not Found !");
        return false;
    }

    public static boolean search_rt(int arr[][]){

        // Method second for search in Top and right through the Ele.

        int key=15;
        int row=arr.length-1, col=0;
        while(col<arr[0].length-1 && row>=0){
            if(key==arr[row][col]){
                System.out.println("Found");
                return true;
            }
            else if(key>arr[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Not Found");
        return false;
    }


    


    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //    System.out.println(Sum(arr)); 
    // System.out.println(search_lb(arr));
    System.out.println(search_rt(arr));
    }
}

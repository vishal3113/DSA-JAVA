package Questions;

public class array1 {

    public static void direction(int arr[][]){
        // int i=0,j=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }



    public static int search2d(int arr[][]){
        int target=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                
                    if(arr[i][j]==target){
                        return 1;
                    }
                
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println("------------------------------");
        // direction(arr);

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }


        System.out.println(search2d(arr));
    }
}

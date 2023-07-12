class Questions{

    public static int Q1(int arr[][]){
        // Question 1 :Print the number of 7’s that are inthe 2d array.
        // Example :Input - int[][] array = { {4,7,8},{8,8,7} };
        // Output - 2

        int count=0,key=7;

        for(int row=0;row<=arr.length-1;row++)
        {
            for(int col=0;col<=arr[0].length-1;col++){
                if(key==arr[row][col]){
                    count++;
                }
            }   
        }

        // Right
        return count;
    }

    public static int Q2(int arr[][]){
        int sum=0;
        // Print out the sum of the numbers inthe second row of the “nums” array.
        // Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // Output - 18

        for(int row=0;row<=arr.length-1;row++){
            for(int col=0;col<=arr[0].length-1;col++){
                if(row==1){
                    sum+=arr[row][col];
                }
            }
        }
        // Right
        return sum;
    }

    public static int[][]  Q3(int arr[][]){

        // Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the
        // process ofswapping therows to columns. For a 2x3 matrix,
        // Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23.
        int row_size=arr.length;
        int col_size=arr[0].length;
        int arr1[][]=new int[col_size][row_size];
  

        for(int col=0;col<=arr[0].length-1;col++){
            for(int row=0;row<=arr.length-1;row++){
                arr1[col][row]=arr[row][col];
               
            }
        } 
         for(int i=0;i<=arr1.length-1;i++){
            for(int j=0;j<=arr1[0].length-1;j++){
                System.out.println(arr1[i][j]);
            }
            System.out.println();
        }
        return arr1;
    }



    public static void main(String args[]){
        Questions obj=new Questions();
        int[][] arr = { {4,7,8},{7,7,7} };
        // 2x3 Matrix
        //  int[][] arr = { {1,4,9},{23,4,3},{2,2,3} };

        
        obj.Q3(arr);
       
        // System.out.println(Q3(arr));
    }
}
import java.util.*;

public class Array {
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found At Index"+i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }

    public static int maxNum(int matrix[][]){
        int max=1, result=0;;    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                result= Math.max(max, matrix[i][j]);
            }
        }
        System.out.println(result);
        return result;
    }
    // Working

    public static void main(String args[]){
        int matrix[][]=new int[3][3];

        int n=matrix.length, m=matrix[0].length;

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }   
        }
        // Func to input a 2D Array
        // search(matrix, 7);\
        maxNum(matrix);

        // print 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();  
        }
    }
}

public class SpiralMatrix {

    public static void printspiral(int arr[][]){

        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;


        while(startrow<=endrow && startcol<=endcol){
            // j-> col, i-> row

            // Top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]);
            }
 System.out.println();
            // Right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]);
            }
 System.out.println();
            // bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startcol==endcol){
                    return;
                }
                System.out.print(arr[endrow][j]);
            }
 System.out.println();
            // left
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(arr[i][startcol]);
            }
 System.out.println();
            // updations

            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        System.out.println();
    }


    
    public static void printspiralanti(int arr[][]){

        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        
        while(startrow<=endrow && startcol<=endcol){
            // j-> col, i-> row

            // Top
            for(int j=startcol;j<=endrow;j++){
                if(startcol==endrow){
                    return;
                }
                System.out.print(arr[j][startcol]+" ");
            }
            System.out.println();
            // Right
            for(int i=startcol+1;i<=endcol;i++){
                
                System.out.print(arr[endrow][i]+" ");
            }
            System.out.println();
            // bottom
            for(int j=endrow-1;j>=startrow;j--){
                
                System.out.print(arr[j][endcol]+" ");
            }
            System.out.println();
            // left
            for(int i=endcol-1;i>=startcol+1;i--){
                 System.out.print(arr[startrow][i]+" ");
            }
            System.out.println();
            // updations    

            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[][]={{1,2,3,4,5},{5,6,7,8,8},{9,10,10,11,12},{13,15,14,15,16}};

        // printspiral(arr);
        printspiralanti(arr);
    
    }
}

import java.util.*;

public class Pattern_Hollow {

    public static void hollow(int ttrows,int ttcol){
        // Outer loop (Go for only rows)
        for(int i=1;i<=ttrows;i++){
            // inner loop (Go fodr only col)
            for(int j=1;j<=ttcol;j++){
                // cell- (i,j)
                if(i==1||i==ttrows||j==1||j==ttcol){
                    // only for boundary Cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void Dryrun(){
        // Overview of the Hollow pattern
    }


    public static void main(String args[]){
        Pattern_Hollow obj=new Pattern_Hollow();
        hollow(4, 4);
    }
}

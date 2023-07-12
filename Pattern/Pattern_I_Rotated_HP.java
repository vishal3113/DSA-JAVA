public class Pattern_I_Rotated_HP {

    
   public static void main(String args[]){
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            // used for the spaces 
            System.out.print(" ");
        }

        for(int j=1;j<=i;j++){
            // Print of the star
            System.out.print("*");
        }
        System.out.println();
    }
   }
    
}
package Array;

public class subarrayp{

  public static void printsubarray(int subarray[]){
    for(int i=0;i<=subarray.length;i++){
      for(int j=i;j<=subarray.length;j++){
        for(int k=i;k<=j;k++){
          System.out.print(subarray[k]+" ");
        }
      }
    }
  }


  public static void main(String args[]){

    

    int subarray[]={2,3,5,6,7,9};
   printsubarray(subarray);
  }
}

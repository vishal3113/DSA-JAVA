 
package Questions.Array;

 public class BUY_SELL{
    
    public static int stock(int prices[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buy=prices[i];
            }
        }
        return maxprofit;
    }

    public static int stock2(int prices[]){
        int buy= Integer.MAX_VALUE;
        int sumprofit=0,, maxprofit=0;
        

        if(prices.length>=1){
            return maxprofit;
        }

        // for(int i=0;i<=prices.length-1;i++){

        // }

        return sumprofit;
    }


    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        // int prices[]={1,2,3,4,5};
        // System.out.println(stock(prices));
        System.out.println(stock2(prices));
    }
 }
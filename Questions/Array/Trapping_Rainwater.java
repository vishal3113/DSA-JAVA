package Questions.Array;

public class Trapping_Rainwater {

    public static int trapped(int height[]){
        int n=height.length;
        // calculate left max boundary -array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlvl=Math.min(leftMax[i],rightMax[i]);

            trappedWater+=waterlvl-height[i];
        }
        return trappedWater;
    }


    public static int trapped_single(int height[]){ 




        return 0;
    }
    
    public static void main(String args[]){
        int height[]={12,3,213,12};
        System.out.println(trapped(height));
    } 
}

public class productarr {


    public static void product(int nums[]){
       
        int nums1[]=new int[nums.length];    

        for(int i=0;i<nums.length;i++){
             int multiply=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                        multiply*=nums[j];
                }
            }
            nums1[i]=multiply;
        }

        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }

    }

    public static void opt_product(int nums[]){
        int left[]=new int [nums.length];
        int right[]=new int [nums.length];

        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length-1;i++){
            left[i]=left[i-1]*nums[i];
        }   

        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }

        int ans[]=new int[nums.length];

        ans[0]=right[1];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }

        ans[nums.length-1]=left[nums.length-2];

        for(int i=0;i<nums.length-1;i++){
            System.out.print(ans[i]+" ");
        }

    }


    // first bad version
    // 278
    

    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        // System.out.println(product(nums));
        // product(nums);
        opt_product(nums);
    }
    
}

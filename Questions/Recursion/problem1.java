package Questions.Recursion;

public class problem1 {
    public static void decreasing(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.println(n+" ");
        decreasing(n-1);
        // working
    }

    public static void increasing(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }

        increasing(n-1);
        System.out.println(n+" ");
    }

    public static int factorial(int n){
        if(n==0){
            return 1; 
        }
        int fn1= factorial(n-1);
        int fac= n*fn1;
        return fac;
    }

    public static int natural_num(int n){
        if(n==1){
            return 1;
        }
        int call= natural_num(n-1);
        int sum=n+call;
        return sum;
    }

    public static int fibonacci(int n){

        if(n==0||n==1){
            return n;
        }

        int fn_1=fibonacci(n-1);
        int fn_2=fibonacci(n-2);
        int fn=fn_1+fn_2;

        return fn;
    }

    public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return sorted(arr, i+1);
    }
    public static void reverse(int n){
        // Program to reverse a digit 
        int reverse=0;
        while(n!=0){
            int reminder= n%10;
            reverse = reverse *10 +reminder;
            n=n/10;
        }
        System.out.println(reverse + " ");
    }

    public static void reverse_add(int n)
    {
        int reverse=0, count_numbers=0;
        while(n!=0){
            int reminder= n%10;
            reverse=reverse*10+reminder;
            count_numbers=+reverse;

        }
        System.out.println(count_numbers+ " ");
        // nwork

    }

    public static void prime(int n)
    {
        // prime 
        int mid=n/2;
        int flag=0;
        if(n==0 || n==1){
            System.out.print("Not a Prime Number");
        }
        else{
      
            for(int i=2;i<=mid;i++){
                if(n%i==0){
                    System.out.println(n+"is a not prime no");
                }
                flag=1;
                // break;
            }
            q
        }
        if(flag==0){
            System.out.println(n+"is a prime");
        }
    }

    public static void hcf(int n1, int n2){
        int hcf=0;
        for(int i=1;i<=n1 || i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf+" is the hcf of "+n1+" "+n2);
    }

    public static void bin_dec(int num){
        int power=0;
        int current=0;

        while(num>0){
            int brk=num%10;
            current=current+(brk*(int)Math.pow(2,power));
            power++;

            num=num/2;  
        }
        System.out.println(current);
        // Working
    }

    public static int first_occurence(int arr[],int key, int i){
        if(arr[i]==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return first_occurence(arr,key,i+1);
    }

    public static int last_occurence(int arr,int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound= last_occurence(arr, key, i+1);
        if(isfound!=-1)
        {
            
        }
    }



    public static void main(String args[]){
        // int n=39 ;
        int n1=12;
        int n2=24;
        // int arr[]={99,2,3,9};
        int i=0;
        int key=8;
        // decreasing(n);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        // increasing(n);
        // System.out.println(factorial(n));
        // System.out.println(natural_num(n));
        // System.out.println(fibonacci(n));
        // System.out.println(sorted(arr, 0));
        // reverse(n);
        // reverse_add(n);
        // prime(n);
        // hcf(n1, n2);
        // int num=101;
        // bin_dec(num);.
      System.out.println(first_occurence(arr, key, i));  

    }
}

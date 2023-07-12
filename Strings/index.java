import java.util.*;
public class index {

    public static void String1(){
        // Initialize a String-------------------------------------------

        // String str="hello";
        // Direct Vallue

        // Using NEw Keyword
        // String str1=new String("Name");

        // Out : True



        System.out.println();
    }


    public static void store(){
        // String str="Hello";
        // String str1="Hello";
        // Stores at same place at heap memory
        // whether when we use new , a new address is created
        // String str2=new String("Hello");

        // out: false
        // ----------------------------------------------------------------


        // ---------------------------------------------
        // String str="Hello";
        // String s="Hel";
        // s=s+"lo";

        // out: False, Sepearte Addresses
        // --------------------------------------------------------------------------
        // use of .equals

        // String str="Hello";
        // String s="Hello";

        // System.out.println(str.equals(s));


// Out: true


        // --------------------------------------------------------------
        // --------------------------------------------------------------------------


        // .CharAt- Returns element at index;

        // String str="Hello";
        // System.out.println(str.charAt(1));
        // out: e

        // --------------------------------------------------------------

        // Why Strings Are Immutable?
        // If i Change a value in an variable which contains same value with 3 more
        // then we got changes in all the variable, whether i need the change in only 
        // one variable


        // -----------------------------------------------------------------

            // .substring to fetch the substring from a string by entering the starting and the ending string

        // String str="Hello";
        // System.out.println(str.substring(1, 3));



        // --------------------------------------------------------------



        // Concat- Use to combine two strings (Only Two)

        // String str="Hello";
        // String str1="Hello";

        // System.out.println(str.concat(str1));

        // Out: HelloHello


        // -----------------------------------------------------------------


        // ComparteTo- Compare Two Strings Word By Word By Their Ascii Value 
        

        




        // ----------------------------------------------------------------
        // System.out.println(s==str);
    }

    public static boolean panlindrome(String st){
        
        int start=0;
        int end=st.length()-1;

        while(start<=end){
            if(st.charAt(start)!=st.charAt(end)){
                return false;
            }
            start++;
            end++;
        }
        return true;
        // Method Using While Loop
    }

    
    public static float Direction(String path){
        // Path is Given in a compass Structure Whether 
        // We Have To Return The Shortest Path TO the GIven
        // Direction
        int x=0,y=0;
        // int X2=0,Y2=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            // South
            if(dir=='S'){
                y--;
            }else if(dir=='W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else{
                x++;
            }

             

           
        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }



    public static void substring(String st){
     
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(st.charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }



    }

    public static void largeststring(){
        String fruits[]={"mango","bango","banana","tea"};

        String largest=fruits[0];

        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static String touppercase(String str){
        StringBuilder sc=new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sc.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sc.append(str.charAt(i));
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();
    }

    public static boolean vowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='i';
    }

    public static void Goodstring(String str){
        int size=str.length();  
        int max=0;
        int count=0;
        for(int i=0;i<size;i++){
            if(vowel(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]){
        // String1();   
        // store();
        // String str="noon";
        
        // substring(str);
        // String path="WSNSSWEN";
    //  System.out.println(Direction(path));  
        // System.out.println( panlindrome(str));
        // largeststring();
        // String str="hi, i am vishal";
        String str="aghafsdoiwwoijoa";
        Goodstring(str);
        // System.out.println(touppercase(str));

    }    
}

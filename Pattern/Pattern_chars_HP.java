public class Pattern_chars_HP{
    public static void main(String args[]){
        int n=4;
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int row=1;row<=line;row++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
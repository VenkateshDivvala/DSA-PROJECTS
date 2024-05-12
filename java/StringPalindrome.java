import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(stringPalindrome(str));
        sc.close();
    }
    static boolean stringPalindrome(String str){
        str=str.toLowerCase();
        int start=0;
        int end=str.length()-1;
        //O(n/2) time complexity
        while (start<end) {
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

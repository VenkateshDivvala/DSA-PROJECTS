package Recursion.subsetsSubsequence;

public class SkipAChar {
    public static void main(String[] args) {
        String st="bacddda";
        //skipAChar(st);
        System.out.println(skipAChar1(st));
    }
    static void skipAChar(String str){
        if(str.isEmpty()){
            return ;
        }
        if(str.charAt(0)!='a'){
              System.out.print(str.charAt(0));
        }
        skipAChar(str.substring(1));
    }
    static String skipAChar1(String str){
         if(str.isEmpty()){
            return "";
         }
         if(str.charAt(0)=='a'){
            return skipAChar1(str.substring(1));
         }
         return str.charAt(0)+skipAChar1(str.substring(1));
    }
}

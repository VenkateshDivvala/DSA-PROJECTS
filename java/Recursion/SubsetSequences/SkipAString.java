package Recursion.subsetsSubsequence;

public class SkipAString {
    public static void main(String[] args) {
        String st="venky is apple appleundefined.";
        System.out.println(skipAString(st).replace(" ",""));
    }
    static String skipAString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            //By using substring it slice of starting mentioned characters.
            return skipAString(str.substring(5));
        }
        return str.charAt(0)+skipAString(str.substring(1));
    }
}

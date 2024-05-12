package Recursion.subsetsSubsequence;

import java.util.ArrayList;

public class LettersOfCombinations {
    public static void main(String[] args) {
        String str="12";
        //letComb("", str);
        System.out.println(letComb1("", str));
    }
    static void letComb(String p,String up){
        if(up.isEmpty()){
           System.out.println(p);
           return ;
        }
        //Converting the first letter digit into integer.
        //For example ascii value of 1 is 49 and 0 is 48.
        //int digit=(int)(up.charAt(0))- 48; or
        int digit=up.charAt(0) - '0';
        //suppose if digit is 1 then range(0,3) i.e. (a,b,c)
        for(int i=(digit-1)*3;i<digit*3;i++){
            //Converting the specified digit to character.
            char ch=(char)('a' + i);
            letComb(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> letComb1(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit=up.charAt(0) - '0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a' + i);
            list.addAll(letComb1(p+ch, up.substring(1)));
        }
        return list;
    }
}

package Recursion.subsetsSubsequence;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        String st="abc";
        //subsetString(st, " ");
        System.out.println(subSequenceString2(st, ""));
    }
    static void subsetString(String str,String str1){
        if(str.isEmpty()){
            System.out.println(str1);
            return ;
        }
        subsetString(str.substring(1), str1+str.charAt(0));
        subsetString(str.substring(1), str1);
    }
    static ArrayList<String> subSequenceString(String str,String str1){
        ArrayList<String> list=new ArrayList<>();
        if(str.isEmpty()){
              list.add(str1);
              return list;
        }
        list.addAll(subSequenceString(str.substring(1), str1+str.charAt(0)));
        list.addAll(subSequenceString(str.substring(1), str1));
        return list;
    }
    //Getting all possible outcomes
    static ArrayList<String> subSequenceString2(String str,String str1){
        ArrayList<String> list=new ArrayList<>();
        if(str.isEmpty()){
              list.add(str1);
                String s=new String();
                StringBuilder str2=new StringBuilder();
                str2.append(str1);
                str2.reverse();
                s=str2.toString();
                list.add(s);
              return list;
        }
        list.addAll(subSequenceString2(str.substring(1), str1+str.charAt(0)));
        list.addAll(subSequenceString2(str.substring(1), str1));
        return list;
    }
}

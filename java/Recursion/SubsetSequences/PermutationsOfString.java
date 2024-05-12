package Recursion.subsetsSubsequence;

import java.util.ArrayList;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str="abc";
        //System.out.println(permutationsOfString1("", str));
        System.out.println(countPermutationsOfString("", str));
    }
    static void permutationsOfString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            permutationsOfString(first+up.charAt(0)+second, up.substring(1));
        }
    }
    static ArrayList<String> permutationsOfString1(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
               list.add(p);
            return list;
        }
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            list.addAll(permutationsOfString1(first+up.charAt(0)+second, up.substring(1)));
        }
        return list;
    }
    //Count no of permutations
    static int countPermutationsOfString(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            count=count+countPermutationsOfString(first+up.charAt(0)+second, up.substring(1));
        }
        return count;
    }
}

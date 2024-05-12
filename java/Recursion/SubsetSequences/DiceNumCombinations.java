package Recursion.subsetsSubsequence;

public class DiceNumOfCombinations {
    public static void main(String[] args) {
        int target=4;
        int face=6;
        noOfComb("", target, face);
    }
    static void noOfComb(String p,int tar,int face){
          if(tar==0){
            System.out.println(p);
            return ;
          }
          for(int i=1;i<=face&&i<=tar;i++){
            noOfComb(p+i, tar-i, face);
          }
    }
}

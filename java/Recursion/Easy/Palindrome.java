package Recursion.Easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print(rev(1001001)==1001001);
    }
    static int rev(int n){
        //To find the length of any number 
        int len=(int)(Math.log10(n))+1;
        return helper(n,len);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}

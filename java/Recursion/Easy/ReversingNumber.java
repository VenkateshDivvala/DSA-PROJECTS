package Recursion.Easy;

public class ReversingNumber {
    public static void main(String[] args) {
        //fun(1234);
        System.out.println(rev(1234));
    }
    //Using empty method 
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.print(n%10);
        fun(n/10);
    }
    //Using helper method to return the answer
    //For each last digit should be multiplied by length of the current number 123 -> 3*100+2*10+1*1
    static int rev(int n){
        //To find the length of any number 
        int len=(int)(Math.log10(n))+1;
        return helper(n,len);
    }
    static int helper(int n,int digits){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}

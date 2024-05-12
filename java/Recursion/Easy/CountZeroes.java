package Recursion.Easy;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(fun(1202000));
    }
    //Method1 without using extra arguments or variables which are needed for future calls.
    static int fun(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){ // if Zero encounters function call itself with some work added to it.
            return 1+fun(n/10);
        }
        return fun(n/10);
    }
    //Method2 using helper method using extra arguments 
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}

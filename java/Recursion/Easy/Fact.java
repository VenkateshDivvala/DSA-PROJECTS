package Recursion.Easy;

public class Fact {
    public static void main(String[] args) {
        System.out.print(fun(5));
    }
    //Product of n to 1
    static int fun(int n){
        if(n==0){
            return 1;
        }
        return n*fun(n-1);
    }
}

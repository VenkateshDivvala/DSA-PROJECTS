package Recursion.Easy;
public class PrintingNumbers {
    public static void main(String[] args) {
        fun(5);
        fun1(5);
    }
    //Printing in descending order from n to 1
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    //Printing from 1 to n
    static void fun1(int n){
        if(n==0){
            return ;
        }
        fun(n-1);
        System.out.println(n);
    }
}

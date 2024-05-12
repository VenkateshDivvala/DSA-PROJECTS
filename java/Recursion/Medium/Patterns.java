package Recursion.Medium;

public class Patterns {
    public static void main(String[] args) {
        int n=4;
        //fun(n,0);
        fun1(n,0);
    }
    static void fun(int row,int col){
        if(row <= 0){
            return ;
        }
        if(col < row){
            System.out.print("* ");
            fun(row , col + 1);
        }
        else{
             System.out.println();
             fun(row - 1 , 0);
        }
    }
    static void fun1(int row,int col){
        if(row <= 0){
            return ;
        }
        if(col < row){
            fun1(row , col + 1);
            System.out.print("* ");
        }
        else{
             fun1(row - 1 , 0);
             System.out.println();
        }
    }
}

package Recursion.Hard;

import java.util.ArrayList;

public class MazeWithoutBacktracking {
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
        System.out.println(returnPath("", 3, 3));
        System.out.println(returnPathDiagonal("", 3, 3));
    }
    //Starting from 0th node and reach to destination node i.e. last node
    //Either we can go right or down at a single time
    //Counting possible no of paths
    static int countPath(int r,int c){
       if(r==1 || c==1){
        return 1;
       }
       int count=0;
       if(r>1){
        count+=countPath(r-1,c);
       }
       if(c>1){
        count+=countPath(r,c-1);
       }
       return count;
    }
    //Return the possible paths down='D',right='R'
    //Either we can down or right 
    static ArrayList<String> returnPath(String p,int r,int c){
        ArrayList<String> li=new ArrayList<>();
        if(r==1 && c==1){
         li.add(p);
         return li;
        }
        if(r>1){
            li.addAll(returnPath(p+'D', r-1, c));
        }
        if(c>1){
            li.addAll(returnPath(p+'R', r, c-1));
        }
        return li;
    }
    //Including diagonal also.
    //diagonal='Q'
    static ArrayList<String> returnPathDiagonal(String p,int r,int c){
        ArrayList<String> li=new ArrayList<>();
        if(r==1 && c==1){
         li.add(p);
         return li;
        }
        //We can't go any more when we reach destination
        //So diagonal requires both r & c.
        if(r == c || (r>1&&c>1)){
            li.addAll(returnPathDiagonal(p+'Q', r-1, c-1));
        }
        if(r>1){
            li.addAll(returnPathDiagonal(p+'D', r-1, c));
        }
        if(c>1){
            li.addAll(returnPathDiagonal(p+'R', r, c-1));
        }
        return li;
    }
}

package Recursion.Hard;
public class NQueens {
    public static void main(String[] args) {
        int noOfQueens=4;
        boolean[][] maze=new boolean[noOfQueens][noOfQueens];
        System.out.println(n_Queens(maze, 0));
    }
    static int n_Queens(boolean[][] maze,int r){
        if(r == maze.length){
            display(maze);
            System.out.println();
            return 1;
        }
        //For counting no of possible arrangements 
        int count=0;
        //From each node in first row all the below rows will be checked for proper arrangement
        //Based on no two or more queens should lie in same row or col or diagonal
        for(int i=0;i<maze.length;i++){
            if(isSafe(maze,r,i)){
                maze[r][i]=true;
                count+=n_Queens(maze, r+1);
                //After every one node in first row the maze should regain it's orginal form 
                maze[r][i]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] maze,int r,int c){
        //Checking vertically if there are queens or not
        for(int i=0;i<r;i++){
            if(maze[i][c]){
                return false;
            }
        }
        //Checking diagonally left if there are elements present or not
        //for diagonal row and col equally modified
        int minLimit=Math.min(r,c); //for not crossing boundary limit and all diagonal blocks
        for(int i=1;i<=minLimit;i++){
            if(maze[r-i][c-i]){
                return false;
            }
        }
        //Checking diagonally right nodes if any quueens are present
        int minLimitRight=Math.min(r,maze.length-c-1);
        for(int i=1;i<=minLimitRight;i++){
              if(maze[r-i][c+i]){
                return false;
              }
        }
        return true;
    }
    static void display(boolean[][] maze){
        for(boolean[] arr:maze){
            for(int i=0;i<arr.length;i++){
                if(arr[i]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

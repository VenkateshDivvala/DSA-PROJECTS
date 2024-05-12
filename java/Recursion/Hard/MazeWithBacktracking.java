package Recursion.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeWithBacktracking {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        // System.out.println(returnAllPaths("", 0, 0,maze));
        int[][] maze1=new int[maze.length][maze[0].length];
        printPathMaze("", 0, 0, maze, 1,maze1);
    }
    static ArrayList<String> returnAllPaths(String p,int r,int c,boolean[][] maze){
        ArrayList<String> li=new ArrayList<>();
        if(r == maze.length-1 && c == maze[0].length-1){
            li.add(p);
            return li;
        }
        //if particular node is visited than don't make any calls just return the list.
        if(!maze[r][c]){
            return li;
        }
        //After visting each node make it as so that future calls won't be called from that node
        maze[r][c]=false;
        if(r < maze.length-1){
            li.addAll(returnAllPaths(p+'D', r + 1, c, maze));
        }
        if(c < maze[0].length-1){
            li.addAll(returnAllPaths(p+'R', r, c+1, maze));
        }
        if(r > 0){
            li.addAll(returnAllPaths(p+'U', r-1, c, maze));
        }
        if(c > 0){
            li.addAll(returnAllPaths(p+'L', r, c-1, maze));
        }
        //If function call over its execution after removing from the stack
        //check that the maze should return to it's original state
        maze[r][c]=true;
        return li;
    }
    //Printing maze as well with path
    static void printPathMaze(String p,int r,int c,boolean[][] maze,int step,int[][]maze1){
        if(r == maze.length-1 && c == maze[0].length-1){
            maze1[r][c]=step;
            for(int[] arr : maze1){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return ;
        }
        //if particular node is visited than don't make any calls just return the list.
        if(!maze[r][c]){
            return ;
        }
        maze1[r][c]=step;
        //After visting each node make it as so that future calls won't be called from that node
        maze[r][c]=false;
        if(r < maze.length-1){
            printPathMaze(p+'D', r + 1, c, maze,step+1,maze1);
        }
        if(c < maze[0].length-1){
            printPathMaze(p+'R', r, c+1, maze,step+1,maze1);
        }
        if(r > 0){
            printPathMaze(p+'U', r-1, c, maze,step+1,maze1);
        }
        if(c > 0){
            printPathMaze(p+'L', r, c-1, maze,step+1,maze1);
        }
        //If function call over its execution after removing from the stack
        //check that the maze should return to it's original state
        maze1[r][c]=0;
        maze[r][c]=true;
    }
}

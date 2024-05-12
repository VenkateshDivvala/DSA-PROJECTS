package Recursion.Hard;

import java.util.ArrayList;

public class MazeWithObsatcles {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,false},
            {true,false,true},
            {true,true,true}
        };
        System.out.println(pathWithoutObstacles("", 0, 0, maze));
    }
    //No of possible paths by notn including obstacle nodes
    static ArrayList<String> pathWithoutObstacles(String p,int r,int c,boolean[][] maze){
        ArrayList<String> li=new ArrayList<>();
        //if r and c reached destination node row or column .
        if(r == maze.length-1 && c == maze[0].length-1){
           li.add(p);
           return li;
        }
        if(maze[r][c]==false){
            return li;
        }
        if(r < maze.length-1){
            li.addAll(pathWithoutObstacles(p+'D',r+1,c,maze));
        }
        if(c < maze[0].length-1){
            li.addAll(pathWithoutObstacles(p+'R',r,c+1,maze));
        }
        return li;
    }
}

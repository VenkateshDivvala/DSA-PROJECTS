import java.util.*;
public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=9;
        System.out.print(Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int[][] arr,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(target>arr[row][mid]){
                cstart=mid+1;
            }
            else if(target<arr[row][mid]){
                cend=mid-1;
            }
            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        //if matrix contains only single row
        if(rows==1){
            return binarySearch(arr, 0, 0, cols-1, target);
        }
        int rstart=0;//Starting index pointing the matrix 
        int rend=rows-1;//ending index
        int cmid=cols/2;//Middle element where we start comparing the target element
        //Loop runs infinite if rstart<rend (rstart is equal to rend when the loop terminates) because After loop breaks there should be two arrays left so (rend-1) taken
        while(rstart<rend-1){
            int mid=rstart+(rend-rstart)/2;
            if(arr[mid][cmid]==target){
              return new int[]{mid,cmid};
            }
            //If target < middle element then slice the rows below the middle element else slice the above rows
            if(arr[mid][cmid]>target){
                rend=mid;
            }
            else{
               rstart=mid;
            }
        }
        //We are left with two rows
        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //The target should be in the range of (0,cmid-1)
        if(arr[rstart][cmid-1]>=target){
            return binarySearch(arr, rstart, 0, cmid-1, target);
        }
        //The target should be in the range of (cmid+1,cols-1) i.e. after middle element to last element in the row
        if(arr[rstart][cmid+1]<=target && arr[rstart][cols-1]>=target){
            return binarySearch(arr,rstart,cmid+1,cols-1,target);
        }
        if(arr[rstart+1][cmid-1]>=target){
            return binarySearch(arr,rstart+1,0,cmid-1,target);
        }
        return binarySearch(arr,rstart+1,cmid+1,cols-1,target);
    }
}

package Recursion.Medium;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,6,3,1,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    //pattern code no change.
    static void bubbleSort(int[] arr,int row,int col){
        if(row <= 0){
            return ;
        }
        if(col < row){
            if(arr[col] > arr[col+1]){
                swap(arr,col,col+1);
            }
            bubbleSort(arr, row, col+1);
        }
        else{
            bubbleSort(arr, row - 1, 0);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

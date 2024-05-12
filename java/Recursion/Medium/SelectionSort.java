package Recursion.Medium;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,6,1,3,0,3};
        selectionSort(arr,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int row){
        if(row <= 0){
            return ;
        }
        int max=max(arr,row);
        swap(arr,row,max);
        selectionSort(arr, row-1);
    }
    static int max(int[] arr,int row){
        int maxIndex=0;
        for(int i=0 ; i <= row ; i++){
          if(arr[i] > arr[maxIndex]){
            maxIndex = i;
          }
        }
        return maxIndex;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

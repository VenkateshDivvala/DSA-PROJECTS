package Recursion.Medium;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,6,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int low,int high){
        if(low >= high){
            return ;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;//pivot
        while(start < end){
            //if element is smaller than pivot then move forward 
            while(arr[start] < arr[mid]){
               start++;
            }
            //if element is greater than pivot than move backward.
            while(arr[end] > arr[mid]){
               end--;
            }
            //if array is sorted then it swapping is not required below won't get executed.
            //if above conditions are violated then elements at start and end are get swapped.
             if(start <= end){
              swap(arr,start,end);
              start++;
              end--;
             }
        }
        //Now pivot is at correct index and start lies just after pivot index and end lies just before pivot index.
        //Now elemnts before pivot are smaller than pivot element and elements after pivot are greater than pivot .
        //But may or may not be sorted.
        quickSort(arr, low, end);
        quickSort(arr,start,high);
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

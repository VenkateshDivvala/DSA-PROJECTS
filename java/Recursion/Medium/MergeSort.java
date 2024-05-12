package Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,6,2,1};
        mergeSort(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
    //Method 1 by creating a new array every time
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        //copyOfrange function creates a new array object from given range. 
        //left array contains first half of the original array.
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        //right array contains second half of the original array.
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];//for storing merged array 
        //Pointer for left array
        int i=0;
        //Pointer for right array
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        //If any elements remains on left array would be added to mixed array.
        while(i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        //If any elements remains on right array would be added to mixed array.
        while(j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
    //Method 2 by not creating a new sub array every time 
    //By using start,mid,end pointers
    static void mergeSort(int[] arr,int start,int end){
        if(end - start ==1){
            return ;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start,int mid,int end){
        ArrayList<Integer> li=new ArrayList<>();
        int i=start;
        int j=mid;
        while(i < mid && j < end){
             if(arr[i] < arr[j]){
                li.add(arr[i]);
                i++;
             }
             else{
                li.add(arr[j]);
                j++;
             }
        }
        while(i < mid){
            li.add(arr[i]);
            i++;
        }
        while(j < end){
            li.add(arr[j]);
            j++;
        }
        for(int k=0;k<li.size();k++){
            //start + k because if start=3 and end=5 then if we do arr[k] where k=0 then for every merge call arr get modified from 0th index.
            //so,we should modify orginal array from start number position index.
            arr[start+k]=li.get(k);
        }
        return ;
    }
}

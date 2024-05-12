package Recursion.Medium;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr={5,1,2};
        int target=5;
        System.out.print(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int tar,int start,int end){
        int mid = start + (end - start)/2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(tar >= arr[start] && tar <= arr[mid]){
               end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
        if(tar >= arr[mid] && tar <=arr[end]){
            start=mid+1;
        }
        else{
            end=mid-1;
            }
        }
        return binarySearch(arr, tar, start, end);
    }
}

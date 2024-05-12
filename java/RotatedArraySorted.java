import java.util.Scanner;

public class RotatedArraySorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={5,5,5,7,2,2,2};
        int target=in.nextInt();
        System.out.print(search1(arr,target));
        in.close();
    }
    //Method 1 
    static int search1(int[] arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tar==arr[mid]){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(tar>=arr[start] && tar<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
            if(tar>=arr[mid] && tar<=arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        }
        return -1;
    }
    //Method 2
    static int search(int[] arr,int target){
        int pivot=pivotElement(arr);
        //if pivot element is not fount then do normal binary search
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        //if target is greater than start element then target lies between start and pivot because we know that right hand side of pivot is smaller then start element
        if(target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int pivotElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //for index out of bound conditions we should check for mid < end
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //Pivot means greatest element so if middle elemnt less than start then do search on start to mid because there is largest pivot in range start and mid
            //if there are duplicates elements in array then ignore those by incrementing start
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(end>start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            //if(arr[start]<arr[mid])
            else{
                 start=mid+1;
            }
        }
        return -1;
    }
}

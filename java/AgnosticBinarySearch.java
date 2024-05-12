import java.util.Scanner;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.print(binarySearch(arr,target));
        in.close();
    }
    //return an index where the element found 
    //Create a function to find the index of the target
    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isAscend=arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;//Because for larger values int is not compatible if (start + end) be taken
            if(target == arr[mid]){
                return mid;
            }
            if(isAscend){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid-1;
                }
                else{
                    end = mid+1;
                }
            }
        }
        return -1;
    }
}

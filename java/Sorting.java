import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int[] arr={7,1,8,2,4,5};
        //insertionSort(arr);
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        //ith loop should run till length-2 times because to avoid index out of bound (if i=length-1 of the array then j=length)
        for(int i=0;i<arr.length-1;i++){
            //Elements to be compared before jth index i.e. LHS part 
            for(int j=i+1;j>0;j--){
                //Beacuse LHS side of a array will be sorted then no need to check elements before j-1 index
                if(arr[j]>arr[j-1]){
                    break;
                }
               if(arr[j]<arr[j-1]){
                 swap(arr,j,j-1);
               }
            }
        }
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //here maximum element should swap from last index of an array end=arr.length-i-1 (-1 is taken because when i=0,j becomes length then index out of bound)
            int end=arr.length-i-1;
            //maximum element will be placed at correct index for every iteration and maximum element is changed for every i
            //Beacuse maximum element should search till (length-i) because elements after that are at correct position
            int max=max(arr,end);
            swap(arr,max,end);
        }
    }
    static int max(int[] arr,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

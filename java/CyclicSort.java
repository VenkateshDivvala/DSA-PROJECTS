import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        //Elements in the array should be continous and also the maximum element in the array should be equals to array elength
        int[] arr={3,5,4,2};
        cycleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
          int curIndex=arr[i]-1;//storing the element correct index. 
          if(arr[i]!=arr[curIndex]){
            swap(arr,i,curIndex);
          }
          else{
            i++;
          }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

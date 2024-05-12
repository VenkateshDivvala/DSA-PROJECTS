import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(35);
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        bubble(list);
        System.out.print(list);
        sc.close();
    }
    //No need of return because arrays are non-primitive as well as pass by reference so, (arr and list) arrays pointing to same object
    static void bubble(ArrayList<Integer> arr){
        //To break the loop if array is sorted
       for(int i=0;i<arr.size();i++){
        boolean swapped=false;
        for(int j=1;j<arr.size()-i;j++){
            if(arr.get(j)<arr.get(j-1)){
                int temp=arr.get(j);
                arr.set(j,arr.get(j-1));
                arr.set(j-1,temp);
                swapped=true;
            }
        }
        //We can get maximum element at the arr[n-i] position after every pass.
        //If array is sorted after some passes then no need to run all the passes till the end so swapped is used.
        if(!swapped){
            break;
        }
       }
    }
}

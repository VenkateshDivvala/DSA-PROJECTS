package Recursion.Medium;
import java.util.*;
public class LinearSearch {
    static ArrayList<Integer> li=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};
        int tar=4;
        //System.out.println(linearSearch(arr, tar, 0));
       // System.out.println(linearSearch1(arr, tar, 0));
       System.out.println(linearSearch2(arr, tar, 0));
    }
    //Normal method
    static int linearSearch(int[] arr,int tar,int index){
      if(index == arr.length){
        return -1;
      }
      if(arr[index] == tar){
        return index;
      }
      return linearSearch(arr, tar, index + 1);
    }
    //If we want to return arraylist on multiple occurence of target
    static ArrayList<Integer> linearSearch1(int[] arr,int tar,int index){
       if(index == arr.length){
         return li;
       }
       if(arr[index] == tar){
        li.add(index);
       }
       return linearSearch1(arr, tar, index+1);
    }
    //If we dont want to create array list outside dynamic list used in the body of function.
    static ArrayList<Integer> linearSearch2(int[] arr,int tar,int index){
        //For every recursive call a new object will be created.
        ArrayList<Integer> list=new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == tar){
            list.add(index);
        }
        //Adding the previous recursive call result to the list in the current function body.
        //for example After index reaches array length the list would be [] and return previous calls.
        //For every recursive call if target founds then index stored in list and calls future recursive functions.
        //For example if target=4 then list would be [index,linearsearch2(arr,tar,index+1)] 
        list.addAll(linearSearch2(arr, tar, index+1));
        return list;
    }
}

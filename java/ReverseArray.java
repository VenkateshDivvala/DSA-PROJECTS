import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<6;i++){
            arr.add(sc.nextInt());
        }
        reverseArray(arr);
        System.out.print(arr);
        sc.close();
    }
    static void reverseArray(ArrayList<Integer> arr){
      int start=0;
      int end=arr.size()-1;
      while(start < end){
        swap(arr,start,end);
        start++;
        end--;
      }
    }
    static void swap(ArrayList<Integer> arr,int index1,int index2){
        int temp=arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);
    }
}

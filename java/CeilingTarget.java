import java.util.Scanner;

public class CeilingTarget {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.print(ceilingTar(arr, target));
        in.close();
    }
    //Return The smallest number which is greater than target
    static String ceilingTar(int[] arr,int target){
         int start=0;
         int end=arr.length-1;
         if(target>arr[end]){
            return "Not Found";
         }
         while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return "The smallest number greater than "+target+" is "+arr[mid];
            }
         }
         return "The smallest number greater than "+target+" is "+arr[start];
    }
}

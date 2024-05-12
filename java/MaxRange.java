import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(maxRange(arr,0,4));
        sc.close();
    }
    static int maxRange(int[] arr,int a,int b){
        if(a>b){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max=arr[a];
        for(int i=a;i<=b;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

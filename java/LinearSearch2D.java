import java.util.*;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter a number: ");
        int num=in.nextInt();
        //int[] arr1=findElement(arr,num);
        //System.out.print(Arrays.toString(arr1));
        System.out.println(findElement(arr, num));
        in.close();
    }
    static String findElement(int[][] arr,int num){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==num){
                    return "Yes,it's found at "+i+","+j;
                }
            }
        }
        return "Not found";
    }
}

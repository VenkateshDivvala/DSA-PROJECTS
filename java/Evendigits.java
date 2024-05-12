import java.util.ArrayList;
import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>(45);
        //User Input
        for(int i=0;i<10;i++)
        {
            arr.add(in.nextInt());
        }
        //creating a function for Number of even digits 
        System.out.print(evenCount(arr));
        in.close();
    }
    static int evenCount(ArrayList<Integer> arr){
        int count=0;
        for(int num:arr)
        {
            if(even(num))
            {
               count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        return ((int)Math.log10(num)+1)%2==0;
    }
}

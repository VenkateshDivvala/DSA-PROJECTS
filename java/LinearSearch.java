import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.print(checkString(str , str1));
        sc.close();
    }
    static boolean checkString(String s,String s1){
        if(s.length() == 0){
            return false;
        }
        String[] arr = s.split(" ");
        for(String index : arr){
            if(s1.equals(index)){
                return true;
            }
        }
        return false;
    }
}

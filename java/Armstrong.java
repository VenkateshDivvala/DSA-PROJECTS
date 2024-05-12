import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=100;i<n;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0,rem;
        int le=Integer.toString(n).length();
        //System.out.println(le);
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem,le);
            n=n/10;
        }
        System.out.println(sum);
        return sum==original;
    }
}

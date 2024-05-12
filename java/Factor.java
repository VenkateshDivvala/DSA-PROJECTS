import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        int n=24;
        findFactors(n);
    }
    //O(sqrt(n)+n/2) =~ O(sqrt(n))
    static void findFactors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<n;i++){
            if(n % i == 0){
                if(i == n/i){ // i=6 and (n=36) n/i=6
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i+" ");
                    list.add(n/i);//For printing in order
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}

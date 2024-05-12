public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        //For finding only primes rest of others ignored if the number contains true ignore it .
        boolean[] arr=new boolean[n+1];
        seiveOfEratosthenes(n,arr);
    }
    //O(n*log(log(n)))
    static void seiveOfEratosthenes(int n,boolean[] arr){
        //We have to assign true for the numbers which are not prime
        //Running for sqrt(n) because multiples of not a prime are gets ignored then there is no use to iterate them.
        for(int i=2;i*i<n;i++){
              if(!arr[i]){
                for(int j=i*2;j<=n;j+=i){  //j=i*2 taken because after ith position the element which is multiple of i exists.
                    arr[j]=true;
                }
              }
        }
        for(int i=2;i<n;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}

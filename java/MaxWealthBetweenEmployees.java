import java.util.Scanner;

public class MaxWealthBetweenEmployees {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter how many employees: ");

        int noOfEmployee=in.nextInt();

        int[][] arr = new int[noOfEmployee][noOfEmployee];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                arr[i][j] = in.nextInt();

            }
        }

        System.out.print(findMaxWealth(arr));
        in.close();
    }
    static String findMaxWealth(int[][] arr){

        int maxWealth=Integer.MIN_VALUE;

        int sum;

        for(int[] num : arr){

            sum=0;

            for(int num1 : num){

               sum += num1;

            }

            if(sum > maxWealth){

                maxWealth = sum;

            }
        }

        return "Maximum Wealth is "+maxWealth;
    }
}

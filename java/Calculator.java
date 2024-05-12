import java.util.*;
public class Calculator{
    public static void main(String args[]){
     int a,b,c=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Operations are +,*,%,/,-");
     while(true){
        System.out.print("Enter operator: ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(ch=='+'){
           c=a+b;
        }
        else if(ch=='-'){
            c=a-b;
        }
        else if(ch=='*'){
            c=a*b;
        }
        else if(ch=='/'){
            if(b==0){
                System.out.println("Operation Can't be performed.");
            }
            else{
            c=a/b;
            }
        }
        else if(ch=='%'){
            c=a%b;
        }
        else{
            System.out.println("Invalid operator please re-enter.");
        }
        System.out.println("Answer: "+c);
        System.out.print("Enter 'Y' to continue and 'N' to discontinue: ");
        ch=sc.next().charAt(0);
        if(ch=='N'){
         break;
        }
     }
     sc.close();    
    }
}
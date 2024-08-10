 import java.util.Scanner;
 public class palindrome {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int rem=0,sum=0,num=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==num){
            System.out.println("Given number is palindrome");
        }
        else{
             System.out.println("Given number is not a palindrome");
        }
        s1.close();
    }
 }
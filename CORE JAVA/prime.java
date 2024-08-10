import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
        System.out.println("Given number is  not a prime number");
        }
        else{
        System.out.println("Given number is a prime number");

        }
     s1.close();
    }
}
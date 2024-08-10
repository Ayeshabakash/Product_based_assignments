import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n=1;
        int a = sc.nextInt();
        for(int i=2;i<=a;i++){
          n=n*i;
        }
        System.out.println("Factorial of the number "+ a + " is : "+ n);
        sc.close();
    }
}

import java.util.Scanner;
public class greaterone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number1");
        int a=sc.nextInt();
        System.out.println("Enter a number2");
        int b=sc.nextInt();
        if(a>b){
        System.out.println(a + " is Greater");
        }else{
        System.out.println(b + " is Greater");
        }
     sc.close();
    }
}
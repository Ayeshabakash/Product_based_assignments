import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int sum =0;
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i]);
         sum =sum+arr[i];
        }
        System.out.println("Sum of Array are:" + sum);
        sc.close();
    }
}
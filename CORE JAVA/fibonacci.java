import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s1.nextInt();
        int arr[]=new int[n];
         arr[0]=1;
         arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("Fibonnaci series upto given number:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            s1.close();
    }
}
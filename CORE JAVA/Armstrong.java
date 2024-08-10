import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s1.nextInt();
        int count=0,rem=0,res=0,num=n,temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(n>0){
            rem=n%10;
            res+=Math.pow(rem,count);
            n=n/10;
        }
        
        if(res==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        s1.close();
    }
}

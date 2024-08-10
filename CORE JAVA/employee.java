import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        int employeeId;
        String employeeName;
        float employeeSalary;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter employee id");
        employeeId =sc.nextInt();
        System.out.println("Enter employee Name");
        employeeName =sc.next();
        System.out.println("Enter employee Salary");
        employeeSalary =sc.nextFloat();
        System.out.println("Enter employee Salary :"+employeeId);
        System.out.println("Enter employee Salary :"+employeeName);
        System.out.println("Enter employee Salary :"+employeeSalary);
        sc.close();
    }
}
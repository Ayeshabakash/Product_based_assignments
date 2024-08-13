
class Employee {
    public void work() {
        System.out.println("Employee is working in office.");
    }
    public double getSalary() {
        return 20000; 
    }
}
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is busy now a days.");
    }
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}
public class four {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println( emp.getSalary());
        HRManager hr = new HRManager();
        hr.work(); 
        hr.addEmployee(); 
        System.out.println( hr.getSalary());
    }
}


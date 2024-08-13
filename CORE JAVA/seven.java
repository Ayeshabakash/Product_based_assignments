class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person {
    private String employeeId;
    private String jobTitle;
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}
public class seven {
    public static void main(String[] args) {
        Employee employee = new Employee("Ayesha", "Siddhika", "78600", "Software Engineer");
        System.out.println( employee.getFirstName());        
        System.out.println( employee.getLastName());          
        System.out.println( employee.getEmployeeId());      
}
}

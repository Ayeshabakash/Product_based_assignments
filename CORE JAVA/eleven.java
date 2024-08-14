public class eleven { 
    abstract class Employee {
        String name;
        double baseSalary;
        Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }
        abstract double calculateSalary();
    }
    class Manager extends Employee {
        double bonus;
        Manager(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }
        @Override
        double calculateSalary() {
            return baseSalary + bonus;
        }
    }
    class Programmer extends Employee {
        double overtimeHours;
        double overtimeRate;
        Programmer(String name, double baseSalary, double overtimeHours, double overtimeRate) {
            super(name, baseSalary);
            this.overtimeHours = overtimeHours;
            this.overtimeRate = overtimeRate;
        }
        @Override
        double calculateSalary() {
            return baseSalary + (overtimeHours * overtimeRate);
        }
    }
    public static void main(String[] args) {
        eleven program = new eleven(); 
        Employee manager = program.new Manager("Anish", 500000, 10000);
        System.out.println("Manager's Salary: $" + manager.calculateSalary());
        Employee programmer = program.new Programmer("Fathima", 40000, 50, 20);
        System.out.println("Programmer's Salary: $" + programmer.calculateSalary());
    }
}

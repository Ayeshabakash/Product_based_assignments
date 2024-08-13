class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot fall below $100.");
        } else {
            super.withdraw(amount);
        }
    }
}
public class five {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(500);
        mySavings.deposit(150);  
        mySavings.withdraw(200); 
        mySavings.withdraw(400); 
    }
}

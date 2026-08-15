package practice4;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Adds the deposited amount to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Displays the current account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("----------------------------------");
    }
}

public class Question5 {
	public static void main(String[] args) {
        BankAccount account = new BankAccount("AC100293", "Alice Smith", 1500.00);

        System.out.println("--- Initial Account Details ---");
        account.displayDetails();

        // Perform deposit
        account.deposit(500.50);

        System.out.println("\n--- Updated Account Details ---");
        account.displayDetails();
    }
}


import java.util.ArrayList;
import java.util.List;

public class Account {

    // Account details
    private String accountNumber;
    private String pin;
    private double balance;

    // Stores all transactions made by the account
    private List<String> transactionHistory;

    // Constructor
    public Account(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;

        // Create an empty transaction history
        transactionHistory = new ArrayList<>();

        // Record the account opening transaction
        addTransaction("Account opened with balance: Rs" + initialBalance);
    }

    // Checks whether the entered PIN is correct
    public boolean validatePIN(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Returns the current account balance
    public double getBalance() {
        return balance;
    }

    // Adds money to the account
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;

            addTransaction("Deposited: Rs" + amount);

            System.out.println(
                "Successfully deposited Rs" + amount
            );
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraws money from the account
    public boolean withdraw(double amount) {

        // Check whether the amount is valid
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        // Check whether enough money is available
        if (amount > balance) {
            System.out.println(
                "Insufficient! Current balance: Rs" + balance
            );
            return false;
        }

        // Deduct the amount from the balance
        balance = balance - amount;

        // Record the transaction
        addTransaction("Withdrew: Rs" + amount);

        System.out.println(
            "Successfully withdrew Rs" + amount
        );

        return true;
    }

    // Displays all transactions made on the account
    public void displayTransactionHistory() {

        System.out.println("\n--- Transaction History ---");

        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions .");
            return;
        }

        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Adds a transaction to the history
    private void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }
}



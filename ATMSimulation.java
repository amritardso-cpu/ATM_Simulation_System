import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMSimulation {
    private static Map<String, Account> bankDatabase = new HashMap<>();
    private static Account currentAccount = null;

    public static void main(String[] args) {
        // Initialize with sample customer data
        bankDatabase.put("234678", new Account("234678", "9999", 80000.0));
        bankDatabase.put("799912", new Account("799912", "1234", 85000.0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Welcome to the ATM Simulation System ----");

        // Authentication Loop
        while (currentAccount == null) {
            System.out.print("\nEnter Account Number: ");
            String accNum = scanner.nextLine();
            
            System.out.print("Enter 4-Digit PIN: ");
            String pin = scanner.nextLine();

            Account acc = bankDatabase.get(accNum);
            if (acc != null && acc.validatePIN(pin)) {
                currentAccount = acc;
                System.out.println("\nLogin Successful! Welcome back.");
            } else {
                System.out.println("Invalid Account Number or PIN. Please try again.");
            }
        }

        // Operation Menu Loop
        boolean running = true;
        while (running) {
            System.out.println("\n----------------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit" );
            System.out.println("3. Withdraw ");
            System.out.println("4. View Statement");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs" + currentAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs");
                    double depAmt = scanner.nextDouble();
                    currentAccount.deposit(depAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs");
                    double witAmt = scanner.nextDouble();
                    currentAccount.withdraw(witAmt);
                    break;
                case 4:
                    currentAccount.displayTransactionHistory();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you . Have a good day !");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
        scanner.close();
    }
}

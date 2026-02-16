import java.util.Scanner;

class ATM {

    private double balance;
    private int pin;

    // Constructor
    public ATM(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Verify PIN
    public boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Change PIN
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN Changed Successfully!");
    }
}

public class MiniATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM userAccount = new ATM(10000.0, 1234); // Default balance & PIN

        System.out.println("===== Welcome to Mini ATM =====");

        // PIN Authentication
        System.out.print("Enter Your PIN: ");
        int enteredPin = sc.nextInt();

        if (!userAccount.verifyPin(enteredPin)) {
            System.out.println("Incorrect PIN! Access Denied.");
            return;
        }

        int choice;

        do {
            System.out.println("\n------ ATM Menu ------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    userAccount.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter New PIN: ");
                    int newPin = sc.nextInt();
                    userAccount.changePin(newPin);
                    break;

                case 5:
                    System.out.println("Thank You for Using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Method
    public void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n====== Bank Management System ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    accounts.add(new Account(name, accNo, balance));
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == depAcc) {
                            System.out.print("Enter Deposit Amount: ");
                            double amount = sc.nextDouble();
                            acc.deposit(amount);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int witAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == witAcc) {
                            System.out.print("Enter Withdraw Amount: ");
                            double amount = sc.nextDouble();
                            acc.withdraw(amount);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int disAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == disAcc) {
                            acc.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}


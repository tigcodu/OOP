// Encapsulation

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String account) {
        this.accountNumber = account;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    void display() {
        System.out.println("--- Account Information ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: P" + getBalance());
    }

    public static void main(String args[]) {

        BankAccount account = new BankAccount();
        Scanner accountScan = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = accountScan.nextLine();
        account.setAccountHolder(name);

        System.out.print("Enter account number: ");
        String number = accountScan.nextLine();
        account.setAccountNumber(number);

        System.out.print("Enter initial balance: ");
        double balance = accountScan.nextDouble();
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            balance = 0.00d;
        }
        account.setBalance(balance);

        account.display();

        System.out.print("Enter amount to deposit: ");
        double deposit = accountScan.nextDouble();
        if (deposit < 0) {
            System.out.println("Error: Invalid deposit amount.");
            deposit = 0.00d;
        }
        else {
            System.out.println("Succesfully deposited P" + deposit);
        }
        
        account.deposit(deposit);

        System.out.print("Enter amount to withdraw: ");
        double withdraw = accountScan.nextDouble();
        if (withdraw > balance) {
            System.out.println("Error: Insufficient funds.");
            withdraw = 0.00d;
        }
        else {
            System.out.println("Succesfully withdrawn P" + withdraw);
        }

        account.withdraw(withdraw);

        account.display();
    }
}
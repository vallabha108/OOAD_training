package com.application.components.bank;

// BankAccount class demonstrating encapsulation
public class BankAccount {
    // Private attribute (data is hidden from direct access)
    private double balance;
    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Ensure balance is never negative
        }
    }
    // Getter method to retrieve the balance (read-only access)
    public double getBalance() {
        return balance;
    }
    // Setter method for depositing money (controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Setter method for withdrawing money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
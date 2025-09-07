package com.application;

import com.application.components.Car;
import com.application.components.bank.BankAccount;

/**
 * Main application class for our Java OOAD project.
 */
public class App {
    public static void main(String[] args) {        
        System.out.println("Welcome to Java Object Oriented Analysis and Design (OOAD) Project!");
        System.out.println("Project is up and running!");
        Car myCar = new Car("Toyota");
        System.out.println("My car name is " + myCar.getName());
        myCar.setName("Toyota Corolla");
        System.out.println("My car name is " + myCar.getName());        
        BankAccount myCitiBank = new BankAccount(10000);
        System.out.println("My account balance is " + myCitiBank.getBalance());
        myCitiBank.withdraw(500);
        System.out.println("My account balance is " + myCitiBank.getBalance());
        myCitiBank.withdraw(10000);
    }
}

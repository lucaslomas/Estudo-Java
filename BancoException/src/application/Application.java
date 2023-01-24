package application;

import model.entites.Account;
import model.exception.WithdrawError;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            System.out.print("Holder: ");
            String name = sc.next();
            sc.next();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(numberAccount, name, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());


        } catch (WithdrawError e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
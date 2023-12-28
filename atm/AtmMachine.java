package atm;

import bank.BankAccount;
import bank.SavingsAccount;
import mock.TransactionGenerator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class AtmMachine {

    private BankAccount currentBankAccount;

    protected AtmMachine(String id, String password) {
        double randomNumber = ThreadLocalRandom.current().nextDouble(0, 50000);
        randomNumber =  Math.round(randomNumber * 100d) / 100d;
        currentBankAccount = new SavingsAccount("Random Name", randomNumber);
    }

    protected void showBalance() {
        System.out.println("The current balance in your account is: " + currentBankAccount.getBalance());
    }

    protected void newDeposit() {
        System.out.println("How much do you want to deposit?");
        Scanner scanner = new Scanner(System.in);
            double deposit = scanner.nextDouble();
            currentBankAccount.makeDeposit(deposit);
    }

    protected void newWithdraw() {
        System.out.println("How much do you want to take out?");
        Scanner scanner = new Scanner(System.in);
            double takeOut = scanner.nextDouble();
            currentBankAccount.withdraw(takeOut);
    }

    protected void lastMovements() {
        TransactionGenerator transactionGenerator = new TransactionGenerator();
        System.out.println("How many transactions would you like to see?");
        Scanner scanner = new Scanner(System.in);
        int transactionNumber = scanner.nextInt();
        ArrayList<String> transactions = transactionGenerator.getTransactions(transactionNumber, "pounds");

        showTransactions(transactions);
    }

    private void showTransactions (ArrayList<String> transactions) {
        for (String transaction: transactions) {
            System.out.println(transaction);
        }
    }
    protected void showLegalTerms() {
        currentBankAccount.legalTermsInformation();
    }

        protected void exit() {
        System.out.println("Thank you for using our services!");
    }
}

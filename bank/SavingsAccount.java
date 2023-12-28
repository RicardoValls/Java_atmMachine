package bank;

public class SavingsAccount extends BankAccount {

    private final double COMMISION = 0.12;

    public SavingsAccount(String name, AccountType accountType, double balance) {
        super(name, accountType, balance);
    }

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public SavingsAccount() {
        super();
    }


    //Methods

    @Override
    public void legalTermsInformation() {
        System.out.println("Legal terms for the Savings account ###");
    }

    @Override
    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("Please, don't type a value below 0.");
            return;
        }
        balance -= money;
        balance -= COMMISION;

        System.out.println("Your balance after withdrawing " + money + " is " + balance);
    }
}

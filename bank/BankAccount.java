package bank;


public abstract class BankAccount {
    //Properties
    private String owner;
    private AccountType accountType;
    protected double balance;


    //Constructors
    public BankAccount(String name, AccountType accountType, double balance) {
        this.owner = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public BankAccount(String name, double balance) {
        this(name, AccountType.SAVINGS, balance);
    }

    public BankAccount() {
        this("", AccountType.SAVINGS, 0);
    }

    //Methods
    public void withdraw(double money){
        if (money < 0) {
            System.out.println("Please, don't type a value below 0.");
            return;
        }
        balance -= money;

        System.out.println("Your balance after withdrawing " + money + " is " + balance);
    }

    public void makeDeposit(double money){
        if (money < 0) {
            System.out.println("Please, don't type a value below 0.");
            return;
        }
        balance += money;

        System.out.println("Your balance after your deposit of " + money + " is " + balance);
    }

    private void changeAccountType (AccountType newType) {
        accountType = newType;
    }

    public abstract void legalTermsInformation();

    public double getBalance () {
        return balance;
    }
}


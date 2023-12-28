package bank;

public class PaySlipAccount extends BankAccount {

    public PaySlipAccount(String name, AccountType accountType, double balance) {
        super(name, accountType, balance);
    }

    public PaySlipAccount(String name, double balance) {
        super(name, balance);
    }

    public PaySlipAccount() {
        super();
    }

    //Methods

    @Override

    public void legalTermsInformation() {
        System.out.println("Legal terms for the Payslip account ###");
    }
}
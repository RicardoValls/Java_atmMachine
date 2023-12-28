package mock;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TransactionGenerator {
   private static final String TRANSFER = "Transfer of ";
   private static final String DEPOSIT = "Deposit of ";
   private static final String WITHDRAW = "Withdraw of ";
   private static final String CARD_PAYMENT = "Card payment of ";
   private static final String PAYSLIP = "Payslip deposit of ";
   private static final String BILLS_PAYMENT = "Payment of ";

   public TransactionGenerator() {
   }

   public ArrayList<String> getTransactions(int numberOfTransactions, String currency) {
      ArrayList<String> transactions = new ArrayList<>();
      for (int i=0; i < numberOfTransactions; i++) {
         int randomTransaction = randomInteger(1, 6);
         String transactionType;

         switch (randomTransaction) {
            case 1:
               transactionType = TRANSFER;
               break;
            case 2:
               transactionType = DEPOSIT;
               break;
            case 3:
               transactionType = WITHDRAW;
               break;
            case 4:
               transactionType = CARD_PAYMENT;
               break;
            case 5:
               transactionType = PAYSLIP;
               break;
            default:
               transactionType = BILLS_PAYMENT;
         }
         double randomMoney= randomDouble(1.0, 3000.0);
         String newTransaction = transactionType + String.format("%.2f", randomMoney) + " " + currency;
         transactions.add(newTransaction);
      }
      return transactions;
   }

   //Methods to generate random numbers needed
   private int randomInteger(int min, int max) {
      return ThreadLocalRandom.current().nextInt(min, max + 1);
   }

   private double randomDouble(double min, double max) {
      return ThreadLocalRandom.current().nextDouble(min, max + 1.0);
   }
}
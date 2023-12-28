package bank;


import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Welcome to the currency conversor");
        System.out.println("Please, write the cuantity to change from Euros to US Dollars:\n");
        
        double euro;
        double usDollar;
        double exchangeRate = 1.09;

        try(Scanner scanner = new Scanner(System.in)) {
            euro = scanner.nextFloat();
        }

        usDollar = euro * exchangeRate; //It has too many decimals

        usDollar = Math.round(usDollar * 100d) / 100d; //formats the double to only 2 decimals
        
        /*
        //Video solution to reduce decimals to 3 using BigDecimal

        String euroString = Double.toString(euro);
        BigDecimal eurosBigDecimal = new BigDecimal(euroString);
        String exchangeRateString = Double.toString(exchangeRate);
        BigDecimal exchangeRateBigDecimal = new BigDecimal(exchangeRateString);

        BigDecimal dollarBigDecimal = eurosBigDecimal.multiply(exchangeRateBigDecimal);
         */

        System.out.println(euro + " Euros equals to " + usDollar + " US Dollars.\n");


    }
    
}

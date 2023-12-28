package atm;
/*
    Improvement of first program simulating an ATM machine menu

*/

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {

        //Ask for credentials
        System.out.println("Please, type your identification number:");
        Scanner scanner = new Scanner(System.in);
            String typeId = scanner.nextLine();
        System.out.println("Please, type your password:");
            String typePass = scanner.nextLine();
        AtmMachine atm = new AtmMachine(typeId, typePass);

        //Operate the ATM machine
        int option;
        
        do { 
            System.out.println("""
                
                Select your option below:\n
                    1 - to check your balance
                    2 - to make a deposit
                    3 - to make a withdraw
                    4 - to check last operations
                    5 - to read legal terms\n
                Please, type the number for your option and press enter.
                Type any other key and press enter to exit.
                    """);

                option = scanner.nextInt();

            switch (option) {
                case 1:
                    atm.showBalance();
                    break;
                case 2:
                    atm.newDeposit();
                    break;
                case 3:
                    atm.newWithdraw();
                    break;
                case 4:
                    atm.lastMovements();
                    break;
                case 5:
                    atm.showLegalTerms();
                    break;
                default:
                    atm.exit();
                    break;
            }
            
        } while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5);
    }
}

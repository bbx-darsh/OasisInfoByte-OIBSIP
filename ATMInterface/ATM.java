// Project 02:-           An ATM Interface

package ATMInterface;
import java.util.Date;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        // Setting up account Balance
        double balance = 90000;
        // Creating an object of Date to get current date and time
        Date date = new Date();
        // Default pin
        int pin = 0000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ourATM");
        System.out.println();
        System.out.println("**********************#################*************************");
        System.out.println("Please, Press 1 to check your Account Balance");
        System.out.println("Please, Press 2 to withdraw money from your Account");
        System.out.println("Please, Press 3 to deposit money into your Account");
        System.out.println("Please, Press 4 to change your ATM pincode");
        System.out.println("Please, Press 5 to exit ");

        int option = sc.nextInt();
        //Switch Case to select optiions of ATM.
        switch (option) {
            case 1:
                System.out.println("Your current Account Balance is Rs. " + balance);
                break;
            case 2:
                System.out.println("Please enter amount to withdraw from your account");
                double withdrawAmount = sc.nextDouble();
                if (balance >= withdrawAmount) 
                {
                    balance = balance - withdrawAmount;
                    System.out.println("Amount withdrawn by you: " + withdrawAmount + ". Your New account Balance is " + balance);
                } else {
                    System.out.println("You do not have enough money to withdraw from your Account. Thank you !");
                }
                break;

            case 3:
                System.out.println("Please, Enter the amount you want to deposit into your Account, Your Current Account Balance is Rs. "+ balance);
                double depositAmount = sc.nextDouble();
                balance = balance + depositAmount;
                System.out.println("You just deposited Rs. " + depositAmount + " on " + date);
                System.out.println("Your new Balance is Rs. "+ balance);
                break;

            case 4:
                System.out.println("Please, Enter your pincode");
                int enterPin = sc.nextInt();
                if (enterPin == pin) {
                    System.out.println("Please, Enter a new pin");
                    int newPin = sc.nextInt();
                    pin = newPin;
                    System.out.println("Your new pin is " + pin);

                } else {
                    System.out.println("The pincode you entered is wrong. Kindly, check it once before Entering");
                }
                break;
            case 5:
            System.out.println("Thank you !!!");
            System.exit(0);
            default:
                System.out.println("Please, Enter a valid option from above mentioned options to access your Account");
        }

        System.out.println("Thank you !!!");

    }
}

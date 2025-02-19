package ContaBanco;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for the agency number
        System.out.print("Please enter the Agency number: ");
        int agency = scanner.nextInt();
        scanner.nextLine(); 

        // Prompt for the account number
        System.out.print("Please enter the Account number: ");
        int account = scanner.nextInt();
        scanner.nextLine();

        // Prompt for the account holder's name
        System.out.print("Please enter the Account Holder's name: ");
        String holder = scanner.nextLine();

        // Prompt for the initial balance
        System.out.print("Please enter the initial balance: ");
        double balance = scanner.nextDouble();

        System.out.println("\nAccount Details:");
        System.out.println("Agency: " + agency);
        System.out.println("Account: " + account);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: $" + balance);

        // Close the scanner to free resources
        scanner.close();
    }
}


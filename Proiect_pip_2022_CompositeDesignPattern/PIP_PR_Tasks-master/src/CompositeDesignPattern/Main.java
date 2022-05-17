package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Object declaring
        Scanner scanObj = new Scanner(System.in);
        CompositeAccount client = new CompositeAccount();
        CompositeAccount savings = new CompositeAccount();


        // User input and object creation for Savings Account no.1
        System.out.println("\n>> SAVINGS ACCOUNT INFORMATION <<");
        System.out.println("Savings Account no.1 balance: ");
        float savings1_balance = scanObj.nextFloat();
        System.out.println("Savings Account no.1 interest[%]: ");
        float savings1_interest = scanObj.nextFloat()/100;

        savings.addAccount(new SavingsAccount(savings1_balance,savings1_interest,1));


        //User input and object creation for Savings Account no.2
        System.out.println("Savings Account no.2 balance: ");
        float savings2_balance = scanObj.nextFloat();
        System.out.println("Savings Account no.2 interest[%]: ");
        float savings2_interest = scanObj.nextFloat()/100;

        savings.addAccount(new SavingsAccount(savings2_balance,savings2_interest,2));
        client.addAccount(savings);


        //User input and object creation for Deposit Account
        System.out.println("\n>> DEPOSIT ACCOUNT INFORMATION <<");
        System.out.println("Deposit Account balance: ");
        float deposit_balance = scanObj.nextFloat();
        client.addAccount(new DepositAccount(deposit_balance,3));


        //User input and object creation for Bills and for Bills Account
        System.out.println("\n>> BILLS ACCOUNT INFORMATION <<");
        ArrayList<BillsAccount.Bill> bills = new ArrayList<>();
        System.out.println("Number of bills: ");
        int nOfBills = scanObj.nextInt();
        for (int i = 0; i < nOfBills; i++) {
            System.out.println("Bill["+(i+1)+"] name: ");
            String bill_name = scanObj.next();
            System.out.println("Bill["+(i+1)+"] amount: ");
            float bill_amount = scanObj.nextFloat();
            bills.add(new BillsAccount.Bill(bill_name,bill_amount));
        }

        System.out.println("Bills Account balance: ");
        float bills_balance = scanObj.nextFloat();
        client.addAccount(new BillsAccount(bills_balance,bills,4));


        //User input and object creation for Subscriptions and for Subscriptions Account
        System.out.println("\n>> SUBSCRIPTIONS ACCOUNT INFORMATION <<");
        ArrayList<SubscriptionsAccount.Subscription> subscriptions = new ArrayList<>();
        System.out.println("Number of subscriptions: ");
        int nOfSubs = scanObj.nextInt();
        for (int i = 0; i < nOfSubs; i++) {
            System.out.println("Subscription["+(i+1)+"] name: ");
            String subscription_name = scanObj.next();
            System.out.println("Subscription["+(i+1)+"] amount: ");
            float subscription_amount = scanObj.nextFloat();
            subscriptions.add(new SubscriptionsAccount.Subscription(subscription_name,subscription_amount));
        }

        System.out.println("Subscriptions Account balance: ");
        float subscriptions_balance = scanObj.nextFloat();
        client.addAccount(new SubscriptionsAccount(subscriptions_balance,subscriptions,5));


        //Displaying info to the console
        client.showInfo();


        //Removing an account from the composite account list
        client.removeAccount(5);
        System.out.println("\n>>> INFO AFTER REMOVING ONE ACCOUNT <<< \n");
        client.showInfo();
    }
}
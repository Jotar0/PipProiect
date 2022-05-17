package CompositeDesignPattern;

import java.util.ArrayList;

public class SubscriptionsAccount implements Account{
    static class Subscription {
        private final String subscriptionName;
        private final float subscriptionAmount;

        public Subscription(String subscriptionName, float subscriptionAmount){
            this.subscriptionAmount = subscriptionAmount;
            this.subscriptionName = subscriptionName;
        }

        public Subscription(){
            this.subscriptionName = "";
            this.subscriptionAmount = 0;
        }
    }
    private final ArrayList<SubscriptionsAccount.Subscription> subscriptions;
    private final int accountNumber;
    private final float balance;
    private final int id;

    public SubscriptionsAccount(float balance, ArrayList<SubscriptionsAccount.Subscription> subscriptions, int id){
        super();
        this.accountNumber = rand.nextInt(9999-1000)+1000;
        this.balance = balance;
        this.subscriptions = subscriptions;
        this.id = id;
    }

    public SubscriptionsAccount(){
        this.accountNumber = 0;
        this.balance = 0;
        this.subscriptions = null;
        this.id = 0;
    }

    public float totalSubscriptions(){
        float total = 0;
        for(Subscription s: subscriptions){
            total =  total + s.subscriptionAmount;
        }
        return total;
    }

    public float remainingBalance(){
        return (this.balance - this.totalSubscriptions());
    }

    @Override
    public float getBalance(){
        return balance;
    }

    @Override
    public float getBalanceAfterExpenses(){
        return this.remainingBalance();
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public void showInfo(){
        System.out.println("\n<Subscriptions Account>");
        System.out.println("Account number: "+this.accountNumber+"\nBalance: "+this.balance+"$\n");
        for(Subscription s: subscriptions){
            System.out.println(s.subscriptionName+" - "+s.subscriptionAmount+"$");
        }
        System.out.println("\nTotal subscriptions value: "+this.totalSubscriptions()+"$\n"+"Remaining balance after paying: "+this.remainingBalance()+"$");
        System.out.println("\n============================================");
    }
}
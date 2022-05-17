package CompositeDesignPattern;
import java.util.ArrayList;

public class BillsAccount implements Account{
    static class Bill {
        private final String billName;
        private final float billAmount;

        public Bill(String billName, float billAmount){
            this.billAmount = billAmount;
            this.billName = billName;
        }

        public Bill(){
            this.billName = "";
            this.billAmount = 0;
        }
    }

    private final ArrayList<Bill> bills;
    private final int accountNumber;
    private final float balance;
    private final int id;

    public BillsAccount(float balance, ArrayList<Bill> bills, int id){
        super();
        this.accountNumber = rand.nextInt(9999-1000)+1000;
        this.balance = balance;
        this.bills = bills;
        this.id = id;
    }

    public BillsAccount(){
        this.id = 0;
        this.accountNumber = 0;
        this.balance = 0;
        this.bills = null;
    }

    public float totalBills(){
        float total = 0;
        for(Bill b: bills){
            total =  total + b.billAmount;
        }
        return total;
    }

    public float remainingBalance(){
        return (this.balance-this.totalBills());
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
        System.out.println("\n<Bills Account>");
        System.out.println("Account number: "+this.accountNumber+"\nBalance: "+this.balance+"$\n");
        for(Bill b: bills){
            System.out.println(b.billName+" - "+b.billAmount+"$");
        }
        System.out.println("\nTotal bills value: "+this.totalBills()+"$\n"+"Remaining after paying: "+this.remainingBalance()+"$\n");
        System.out.println("============================================");
    }
}
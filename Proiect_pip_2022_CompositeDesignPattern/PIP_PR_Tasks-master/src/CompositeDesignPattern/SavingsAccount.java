package CompositeDesignPattern;

public class SavingsAccount implements Account{
    private final int accountNumber;
    private final float balance;
    private final float interest;
    private final int id;

    public SavingsAccount(float balance, float interest, int id){
        super();
        this.accountNumber = rand.nextInt(9999-1000)+1000;
        this.balance = balance;
        this.interest = interest;
        this.id = id;
    }
    public SavingsAccount(){
        this.accountNumber = 0;
        this.balance = 0;
        this.interest = 0;
        this.id = 0;
    }

    public float balanceNextMonth(){
        return (this.balance + this.balance * interest);
    }

    @Override
    public float getBalance(){
        return balance;
    }

    @Override
    public float getBalanceAfterExpenses(){
        return balance;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public void showInfo(){
        System.out.println("\n<Savings Account>");
        System.out.println("Account number: "+this.accountNumber+"\nBalance: "+ this.balance+"$\n"+"Interest: "+this.interest*100+"%");
        System.out.println("Balance after interest: "+this.balanceNextMonth()+"$");
        System.out.println("\n============================================");
    }
}
package CompositeDesignPattern;

public class DepositAccount implements Account {
    private final int accountNumber;
    private final float balance;
    private final int id;

    public DepositAccount(float balance, int id){
        super();
        this.accountNumber = rand.nextInt(9999-1000)+1000;
        this.balance = balance;
        this.id = id;
    }

    public DepositAccount(){
        this.accountNumber = 0;
        this.balance = 0;
        this.id = 0;
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
        System.out.println("\n<Deposit Account>\n"+"Account number: "+this.accountNumber+"\nBalance: "+this.balance+"$");
        System.out.println("\n============================================");
    }
}
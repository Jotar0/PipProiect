package CompositeDesignPattern;

import java.util.ArrayList;

public class CompositeAccount implements Account{
    public ArrayList<Account> accountList = new ArrayList<>();

    public void addAccount(Account acc){
        accountList.add(acc);
    }
    public void removeAccount(int id){
        int index=0;
        for(Account a: accountList){
            if(a.getId()==id){
                index = accountList.indexOf(a);
            }
        }
        accountList.remove(index);
    }

    @Override
    public int getId(){
        return 0;
    }

    @Override
    public float getBalance() {
        float totalBalance = 0;
        for(Account acc: accountList){
            totalBalance = totalBalance + acc.getBalance();
        }
        return totalBalance;
    }

    @Override
    public float getBalanceAfterExpenses(){
        float totalBalanceAfterExpenses = 0;
        for(Account acc: accountList){
            totalBalanceAfterExpenses = totalBalanceAfterExpenses + acc.getBalanceAfterExpenses();
        }
        return totalBalanceAfterExpenses;
    }

    @Override
    public void showInfo(){
        System.out.println(">>Info<<");
        System.out.println("Total balance: "+this.getBalance()+"$");
        System.out.println("Total balance after expenses: "+this.getBalanceAfterExpenses()+"$\n============================================");
        for(Account acc: accountList){
            acc.showInfo();
        }

    }
}
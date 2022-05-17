package CompositeDesignPattern;

import java.util.Random;

public interface Account {
    Random rand = new Random();
    float getBalance();
    float getBalanceAfterExpenses();
    int getId();
    void showInfo();
}
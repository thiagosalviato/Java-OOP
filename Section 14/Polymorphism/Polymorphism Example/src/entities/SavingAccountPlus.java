package entities;

public class SavingAccountPlus extends SavingsAccount{

    @Override
    public void withdraw(double amount){
        balance -= amount + 2.0;
    }
}

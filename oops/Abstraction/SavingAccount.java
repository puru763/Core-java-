package Abstraction;
public class SavingAccount extends Account {
    public SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public  void deposite(Double amount)
    {
        balance+=amount;
        System.out.println("Deposite Successfully");
    }

   
    @Override
    public void withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("insufficient Balance");
        } else {
            System.out.println("withdraw Successfully");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance is :" + balance);
    }

   
}

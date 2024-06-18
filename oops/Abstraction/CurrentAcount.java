package Abstraction;

class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposite(Double amount) {
        balance += amount;
        System.out.println("deposite successfully");
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

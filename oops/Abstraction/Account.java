package Abstraction;

abstract class Account {

    protected double balance;
    public abstract void deposite(Double amount);
    public abstract void withdraw(Double amount);
    public abstract void checkBalance();

}
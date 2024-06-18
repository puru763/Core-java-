package Abstraction;

public class BankingApplication {

    public static void main(String[] args) {
        
        Account savingaccount = new SavingAccount(1000.0);
        savingaccount.withdraw(200.0);
        savingaccount.checkBalance();
        savingaccount.deposite(300.00);


        Account currentaccount = new CurrentAccount(1000.0);
        currentaccount.withdraw(200.0);
        currentaccount.checkBalance();
        currentaccount.deposite(300.00);
    }

}




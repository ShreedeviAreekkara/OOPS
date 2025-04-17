package Inheritance.problem5;

//5. Write a Java program to create a class known as "BankAccount"
// with methods called deposit()and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw()
// method to prevent withdrawals if the account balance falls below one hundred.

import javax.security.auth.login.AccountException;

public class BankAccount {
    private float balance;
    private String accountNumber;


    BankAccount(String accountNumber,float balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(float amount){
        balance +=amount;
    }
    public void withdraw(float amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient minimum balance");
        }
    }
    public float getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(String accountNumber,float balance){
        super(accountNumber,balance);
    }

    @Override
    public void withdraw(float amount){
        if(getBalance()-amount <= 100){
            System.out.println("Balance has reached 100 Rs");
        }
        else {
            super.withdraw(amount);
        }
    }
}

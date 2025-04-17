package Inheritance.problem5;

public class Main {
    public static void main(String[] args) {
        BankAccount ba123= new BankAccount("ba123",10000);
        SavingsAccount sa123 = new SavingsAccount("sa123",2000);

        ba123.deposit(100);
        System.out.println("The bank balance after 100 rs deposit is: "+ba123.getBalance());
        ba123.withdraw(200);
        System.out.println("The bank balance after 200 rs withdrawal is: "+ba123.getBalance());
        sa123.deposit(200);
        System.out.println("The Savings account balance after 200 rs deposit is: "+sa123.getBalance());
        sa123.withdraw(300);
        System.out.println("The Savings account balance after 300 rs deposit is: "+sa123.getBalance());
        SavingsAccount sa1 = new SavingsAccount("sa1",3000);
        System.out.println("The Savings account has been set with a new balance  "+sa1.getBalance());

        sa1.withdraw(2950);

        System.out.println(sa1.getBalance());
    }
}

package Bank;

import java.util.*;

class Account{
    String name;
    long accNo;
    double balance;

    Account(String n, long accno, double bal){
        name=n;
        accNo=accno;
        balance=bal;
    }

    void showDetails(){
        System.out.println("Balance is " + balance);
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
        }
        else {
            balance = balance + amount;
            System.out.println("Available balance is " + balance);
        }
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Inavlid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient amount to withdraw");
        }
        else {
            balance = balance - amount;
            System.out.println("Available balance is " + balance);
        }
    }

    public String toString(){
        return name + " - " + accNo + " - " + balance;
    }
}
class savingAccount extends Account{
    double interestRate;

    savingAccount(String n, long accno, double bal, double rate){
        super(n,accno,bal);
        interestRate=rate;
    }

    void calInterest(){
        double calAmount = (balance * interestRate)/100;
        balance = balance + calAmount;
        System.out.println("New Available balance is " + calAmount);
    }
}
public class Main{
    public static void main(String[] args) {
        savingAccount s1=new savingAccount("AAAA",12345678,5247891,12);
        s1.showDetails();
        s1.deposit(157956);
        s1.withdraw(200000);
        s1.showDetails();
    }
}
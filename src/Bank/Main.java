package Bank;

import java.util.*;
import java.util.ArrayList;

class Account{
    String name;
    long accountNo;
    double balance;

    Account(String n, long accNo, double bal){
        name=n;
        accountNo=accNo;
        balance=bal;
    }

    void showDetails(){
        System.out.println("Balance is " + balance);
    }

    public String toString(){
        return name + " - " + accountNo + " - " + balance;
    }
}
class savingAccount extends Account{
    double interestRate;

    savingAccount(String n, long accNo, double bal, double rate){
        super(n,accNo,bal);
        interestRate=rate;
    }

    void addInterest(){
        double interestAmount = (balance * interestRate)/100;
        balance = balance + interestAmount;
        System.out.println("Available balance is " + interestAmount);
    }
}
class sharesAccount extends Account{
    int noOfShares;
    int shPrice;

    sharesAccount(String n, long accNo, double bal, int numSh, int shPri){
        super(n,accNo,bal);
        noOfShares=numSh;
        shPrice=shPri;
    }

    void sharesCal(){
        double amount = (noOfShares * shPrice);
        System.out.println("Shares amount " + amount);
    }
}
class divCal extends Account{
    double sharesValue;
    String memberType;

    divCal(String n, long accNo, double bal, double shValue, String memType){
        super(n,accNo,bal);
        sharesValue=shValue;
        memberType=memType;
    }

    void calDiv(){
        double dividendAmount;
        if(memberType.equals("Premium")){
            dividendAmount=(sharesValue*8)/100;
        } else if (memberType.equals("Regular")) {
            dividendAmount=(sharesValue*5)/100;
        }
        else {
            dividendAmount=0;
        }
        System.out.println("Dividend amount is " + dividendAmount);
    }
}
public class Main{
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        HashMap<Long, Account> accountMap= new HashMap<>();

            savingAccount s1=new savingAccount("AAAAA", 123456789L, 4444454, 10);
            sharesAccount sh1=new sharesAccount("BBBBB",147852369L,1200200,56,7500);
            divCal d1=new divCal("CCCCC",321456789L, 74589612, 7500,"Premium");

            accounts.add(s1);
            accounts.add(sh1);
            accounts.add(d1);

        System.out.println(accounts);

        accountMap.put((long) s1.accountNo , s1);
        accountMap.put((long)sh1.accountNo , sh1);
        accountMap.put((long) d1.accountNo , d1);

        System.out.println("--------All accounts details----------");
        for(Account acc : accounts){
            acc.showDetails();
        }

        System.out.println("-------Lookup for account-------------");
        Account found = accountMap.get(147852369L);
        found.showDetails();
    }
}
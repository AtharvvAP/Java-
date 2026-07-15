package Bank;

import java.util.*;
import java.util.ArrayList;

//class Account{
//    String name;
//    long accountNo;
//    double balance;
//
//    Account(String n, long accNo, double bal){
//        name=n;
//        accountNo=accNo;
//        balance=bal;
//    }
//
//    void showDetails(){
//        System.out.println("Balance is " + balance);
//    }
//
//    public String toString(){
//        return name + " - " + accountNo + " - " + balance;
//    }
//}
//class savingAccount extends Account{
//    double interestRate;
//
//    savingAccount(String n, long accNo, double bal, double rate){
//        super(n,accNo,bal);
//        interestRate=rate;
//    }
//
//    void addInterest(){
//        double interestAmount = (balance * interestRate)/100;
//        balance = balance + interestAmount;
//        System.out.println("Available balance is " + interestAmount);
//    }
//}
//class sharesAccount extends Account{
//    int noOfShares;
//    int shPrice;
//
//    sharesAccount(String n, long accNo, double bal, int numSh, int shPri){
//        super(n,accNo,bal);
//        noOfShares=numSh;
//        shPrice=shPri;
//    }
//
//    void sharesCal(){
//        double amount = (noOfShares * shPrice);
//        System.out.println("Shares amount " + amount);
//    }
//}
//class divCal extends Account{
//    double sharesValue;
//    String memberType;
//
//    divCal(String n, long accNo, double bal, double shValue, String memType){
//        super(n,accNo,bal);
//        sharesValue=shValue;
//        memberType=memType;
//    }
//
//    void calDiv(){
//        double dividendAmount;
//        if(memberType.equals("Premium")){
//            dividendAmount=(sharesValue*8)/100;
//        } else if (memberType.equals("Regular")) {
//            dividendAmount=(sharesValue*5)/100;
//        }
//        else {
//            dividendAmount=0;
//        }
//        System.out.println("Dividend amount is " + dividendAmount);
//    }
//}
public class Main{
    public static void main(String[] args) {
        int balance = 8541;

        Scanner sc= new Scanner(System.in);


        try{
            System.out.println("Enter amount for withdraw");
            int amount = sc.nextInt();

            if(amount <= 0){
                System.out.println("Invalid amount");
            }
            else if(amount <= balance){
                balance = balance-amount;
                System.out.println("Withdrawl success");
                System.out.println("Remaining balance " + balance);
            }else {
                System.out.println("Insufficient balance");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Amount, Please enter valid numeric amount");
        }finally {
            System.out.println("Thank you for using");
        }
    }
}
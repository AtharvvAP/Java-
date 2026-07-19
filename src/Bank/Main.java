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
        System.out.println("Interest on Available balance is " + calAmount);
    }
}
class sharesAccount extends Account{
    int sharesPrice;
    int noOfShares;

    sharesAccount(String n, long accno, double bal, int shPri, int noOfShr){
        super(n,accno,bal);
        sharesPrice=shPri;
        noOfShares=noOfShr;
    }

    void calShares(){
        double shareCal = (sharesPrice * noOfShares);
        System.out.println("Shares Calculation " + shareCal);
    }
}
class divCal extends Account{
    String memberType;
    double sharesValue;

    divCal(String n, long accno, double bal, String memType, double shValue){
        super(n,accno,bal);
        memberType=memType;
        sharesValue=shValue;
    }

    void calDiv(){
        double dividendAmount;
            if(memberType.equals("Premium")){
                dividendAmount=(sharesValue * 8)/100;
            } else if (memberType.equals("Regular")) {
                dividendAmount=(sharesValue * 5)/100;
            }
            else {
                dividendAmount=0;
            }
        System.out.println("Dividend amount is " + dividendAmount);
    }
}
public class Main{
    public static void main(String[] args) {
        savingAccount s1=new savingAccount("AAAA",12345678,52478,12);
        savingAccount s2=new savingAccount("BBBB",258741369,14578,12);

        sharesAccount sh1=new sharesAccount("CCCC",987456321,45896,1500,154);
        sharesAccount sh2=new sharesAccount("DDDD",321456789,56875,567,100);

        divCal d1=new divCal("EEEE",14785236,58547,"Premium",1547);
        divCal d2=new divCal("FFFF",58796734,54782,"Regular",354);

        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(s1);
        accounts.add(s2);
        accounts.add(sh1);
        accounts.add(sh2);
        accounts.add(d1);
        accounts.add(d2);

        HashMap<Long, Account> accountMap=new HashMap<>();
        accountMap.put(s1.accNo, s1);
        accountMap.put(s2.accNo, s2);
        accountMap.put(sh1.accNo, sh1);
        accountMap.put(sh2.accNo, sh2);
        accountMap.put(d1.accNo, d1);
        accountMap.put(d2.accNo, d2);

        for(Account acc : accounts){
            acc.showDetails();
        }

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter account number to operate on : ");
        long accountNo=sc.nextLong();
        Account select=accountMap.get(accountNo);

        if(select == null){
            System.out.println("Account not found , Enter valid account number.");
            return;
        }

        if(select instanceof sharesAccount){
            sharesAccount sa=(sharesAccount) select;
            sa.calShares();
            sa.showDetails();
        }

        if(select instanceof divCal){
            divCal d=(divCal) select;
            d.showDetails();
            System.out.println("Member Type is " +d.memberType);
            d.calDiv();
        }

        try {
            System.out.println("Enter amount to deposit");
            double depAmt=sc.nextDouble();
            select.deposit(depAmt);
            System.out.println("Enter amount to withdraw");
            double withAmt=sc.nextDouble();
            select.withdraw(withAmt);
        }catch (InputMismatchException e){
            System.out.println("Entered invalid amount");
        }finally {
            System.out.println("Thank you for using services");
        }

        System.out.println("Looking up for account " + accountNo);
        Account found = accountMap.get(accountNo);
        found.showDetails();
    }
}
package Bank;

import java.util.*;

abstract class Account{
    protected String name;
    protected long accNo;
    protected double balance;
    protected int pin;
    protected ArrayList<String> history = new ArrayList<>();

    Account(String n, long accno, double bal, int p){
        name=n;
        accNo=accno;
        balance=bal;
        pin=p;
    }

    abstract void calculate();

    public String getName(){
        return name;
    }

    public long getAccNo(){
        return accNo;
    }

    public double getBalance(){
        return balance;
    }

    void showDetails(){
        System.out.println("Balance is " + balance);
    }

    void showHistory(){
        System.out.println("Transaction History : ");
        for (String entry : history){
            System.out.println(entry);
        }
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
        }
        else {
            balance = balance + amount;
            history.add("+" + amount);
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
            history.add("-" + amount);
            System.out.println("Available balance is " + balance);
        }
    }

    public String toString(){
        return name + " - " + accNo + " - " + balance;
    }
}
class savingAccount extends Account{
    double interestRate;

    savingAccount(String n, long accno, double bal, double rate, int p){
        super(n,accno,bal,p);
        interestRate=rate;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Interest Rate is " +interestRate +"%");
    }

    void calculate(){
        double calAmount = (balance * interestRate)/100;
        balance = balance + calAmount;
        System.out.println("Interest on Available balance is " + calAmount);
    }
}
class sharesAccount extends Account{
    int sharesPrice;
    int noOfShares;

    sharesAccount(String n, long accno, double bal, int shPri, int noOfShr, int p){
        super(n,accno,bal,p);
        sharesPrice=shPri;
        noOfShares=noOfShr;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("No. of shares " + noOfShares + " @price " + sharesPrice);
    }

    void calculate(){
        double shareCal = (sharesPrice * noOfShares);
        System.out.println("Shares Calculation " + shareCal);
    }
}
class divCal extends Account{
    String memberType;
    double sharesValue;

    divCal(String n, long accno, double bal, String memType, double shValue, int p){
        super(n,accno,bal,p);
        memberType=memType;
        sharesValue=shValue;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Member Type" + memberType);
    }

    void calculate(){
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
        savingAccount s1=new savingAccount("AAAA",12345678,52478,12,1111);
        savingAccount s2=new savingAccount("BBBB",258741369,14578,12,2222);

        sharesAccount sh1=new sharesAccount("CCCC",987456321,45896,1500,154,3333);
        sharesAccount sh2=new sharesAccount("DDDD",321456789,56875,567,100,4444);

        divCal d1=new divCal("EEEE",14785236,58547,"Premium",1547,5555);
        divCal d2=new divCal("FFFF",58796734,54782,"Regular",354,6666);

        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(s1);
        accounts.add(s2);
        accounts.add(sh1);
        accounts.add(sh2);
        accounts.add(d1);
        accounts.add(d2);

        HashMap<Long, Account> accountMap=new HashMap<>();
        accountMap.put(s1.getAccNo(), s1);
        accountMap.put(s2.getAccNo(), s2);
        accountMap.put(sh1.getAccNo(), sh1);
        accountMap.put(sh2.getAccNo(), sh2);
        accountMap.put(d1.getAccNo(), d1);
        accountMap.put(d2.getAccNo(), d2);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter account number to operate on : ");
        long accountNo=sc.nextLong();
        Account select=accountMap.get(accountNo);

        if(select == null){
            System.out.println("Account not found , Enter valid account number.");
            return;
        }

        System.out.println("Enter PIN ");
        int enteredPin=sc.nextInt();
        if(enteredPin != select.pin){
            System.out.println("Access denied, Enter correct PIN");
            return;
        }

       boolean running = true;

        while (running) {
            try {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Calculate");
                System.out.println("4. Show Details");
                System.out.println("5. Show Transaction History");
                System.out.println("6. Transfer Money");
                System.out.println("7. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit");
                        double depAmt = sc.nextDouble();
                        select.deposit(depAmt);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        double withAmt = sc.nextDouble();
                        select.withdraw(withAmt);
                        break;
                    case 3:
                       select.calculate();
                       break;
                    case 4:
                       select.showDetails();
                       break;
                    case 5:
                        select.showHistory();
                        break;
                    case 6:
                        System.out.println("Enter account no. to transfer money");
                        long targetAccNo=sc.nextLong();
                        Account target=accountMap.get(targetAccNo);
                        if(target == null){
                            System.out.println("Cannot find account");
                        }else {
                            System.out.println("Enter amount to transfer");
                            double transferAmt=sc.nextDouble();
                            if(transferAmt <= 0){
                                System.out.println("Enter Valid Amount");
                            } else if (transferAmt > select.getBalance()) {
                                System.out.println("Insufficient amount in account");
                            }else {
                                select.balance-=transferAmt;
                                target.balance+=transferAmt;
                                select.history.add("Transfer " + transferAmt + " to account " + targetAccNo);
                                target.history.add("Received " + transferAmt + " from account " + accountNo);
                                System.out.println("Transfered " + transferAmt + " to " + targetAccNo + " Successfully ");
                                System.out.println("Available balance is " +select.getBalance());
                            }
                        }
                        break;
                    case 7:
                        running = false;
                        System.out.println("Thank you for using service");
                        break;
                    default:
                        System.out.println("Inavlid Choice, Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, Try again");
                sc.nextLine();
            }
        }
        System.out.println("Looking up for account " + accountNo);
        Account found = accountMap.get(accountNo);
        found.showDetails();
    }
}
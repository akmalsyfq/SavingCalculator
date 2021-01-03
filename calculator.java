package savingaccount;
import java.util.*;

public class SavingsAccount {

private double balance;
private double annualInterestRate;
private double totalDeposits;
private double totalWithdraws;
private double totalInterests;
double endingBalance;
double totalBalance; 


    SavingsAccount(double balance, double annualInterestRate) {
    Scanner scan=new Scanner(System.in);
        System.out.print("Enter Balance: RM");
        this.balance=scan.nextDouble();
        System.out.print("Interest Rate(%): ");
        this.annualInterestRate=scan.nextDouble();
        
    }

public void setTotalDeposits(double totalDeposits){
    this.totalDeposits=totalDeposits;
    this.balance+=totalDeposits;
}

public void setTotalWithdraws(double totalWithdraws){
    this.totalWithdraws=totalWithdraws;
    this.balance-=totalWithdraws;
}
public void calculateTotalInterest(){
   
    if (annualInterestRate==5)
    {this.totalInterests=5*this.balance;}
    else if (annualInterestRate==7)
    {this.totalInterests=7*this.balance;}
    else if (annualInterestRate==9)
    {this.totalInterests=9*this.balance;}
}

public void calculateTotalBalance(){
    this.totalBalance=this.balance+this.totalInterests;
}
public String toString(){
    return "\n Ending Balance: RM"+totalBalance+"\n Total Deposit: RM"+totalDeposits+"\n Total Withdraws: RM"+totalWithdraws+"\n Total Interest: RM"+totalInterests; 
    }

}

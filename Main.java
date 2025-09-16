
package Encapsulation;
class BankAccount { 
    private String accountHolder; 
    private double balance; 
 
    public String getAccountHolder() { 
        return accountHolder; 
    } 
 
    public void setAccountHolder(String accountHolder) { 
        this.accountHolder = accountHolder; 
    } 
 
    public double getBalance() { 
        return balance; 
    } 
 
    public void setBalance(double balance) { 
        if(balance >= 0) { 
            this.balance = balance; 
        } else { 
            System.out.println("Balance cannot be negative!"); 
        } 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        BankAccount acc = new BankAccount(); 
        acc.setAccountHolder("Aditya"); 
        acc.setBalance(5000); 
 
        System.out.println("Account Holder: " + acc.getAccountHolder()); 
        System.out.println("Balance: ₹" + acc.getBalance()); 
 
        acc.setBalance(-1000); 
    } 
} 
 

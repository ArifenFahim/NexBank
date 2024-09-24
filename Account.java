public class Account {
    private int accountNumber;
    private double balance;
    
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    public void display(){
        System.out.println("Account number is:"+accountNumber);
        System.out.println("Account balance:"+balance);
    }
}

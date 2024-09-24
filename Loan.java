public class Loan extends Account{
    private int accountNumber;
    private double amount;

    public Loan(int accountNumber, double amount){
        super(accountNumber,amount);
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public void display(){
        super.display();
        System.out.println("Your Loan Balance is:"+amount);
    }
    
}

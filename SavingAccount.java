public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void display(){
        super.display();
        System.out.println("Your interest is "+interestRate+"%");
    }
}

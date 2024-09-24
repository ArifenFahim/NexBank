public class CheckingAccount extends Account implements Trancection {
    private double balance;
    
    public CheckingAccount(int accountNumber, double balance ){
        super(accountNumber,balance);
        this.balance=balance;
    }
    public void transectionId(){
        System.out.println("Transection ID: TUatc809Vcrg.");
    }
    public void transectionAmmount(){
        System.out.println("Your transection balance is:"+balance);
    }
     
}

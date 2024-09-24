public class ATM extends Account implements Trancection{
    private int PIN;
    private double balance;
    public ATM(int accountNumber,double balance,int PIN){
        super(accountNumber,balance);
        this.balance=balance;
        this.PIN=PIN;
    }
    
    public void transectionId(){
        System.out.println("Transection ID: TUatc809Vcrg.");
    }
    public void transectionAmmount(){
        System.out.println("Your transection balance is:"+balance);
    }
    public void display(){
        System.out.println("Transection succesfull.");
    }
}

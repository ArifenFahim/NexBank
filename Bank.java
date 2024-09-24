import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Bank{
    public static String BankName;
    public static void main(String[] args) {
        
        ArrayList<Coustomer>coustomer=new ArrayList<Coustomer>();  //ArrayList for coustomer
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bank name:");
        BankName=sc.nextLine();
        System.out.println("Bank Name is:"+BankName);
        System.out.println("How many Coustomer information:");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Coustomer "+(i+1)+" Information:");
            System.out.print("Enter Name: ");
            String cName=sc.nextLine();
            System.out.print("Enter Address: ");
            String cAddress=sc.nextLine();
            System.out.println("Enter contract number:");
            String Contract=sc.nextLine();
            System.out.println("Enter Account number:");
            int cAccount=sc.nextInt();
            System.out.println("Enter Balance:");
            double cbalance=sc.nextDouble();

            coustomer.add(new Coustomer(cName,cAddress,Contract,cAccount,cbalance));
            sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Customer Name:"+coustomer.get(i).getName());
            System.out.println("Customer Name:"+coustomer.get(i).getAddress());
            System.out.println("Customer Name:"+coustomer.get(i).getContactNumber());
            System.out.println("Customer Name:"+coustomer.get(i).getAccountNumber());
            System.out.println("Customer Name:"+coustomer.get(i).getBalance());
        }
        
        
        ///----Saving Accounts details---//
        
        System.out.println("Saveing Account");
        System.out.println("Enter Account Number:");
        int acnum=sc.nextInt();
        System.out.println("Enter blance:");
        double acblance=sc.nextDouble();
        System.out.println("Your interestrate:");
        double intrest=sc.nextDouble();
        SavingAccount saccount=new SavingAccount(acnum,acblance,intrest);
        saccount.display();
        
        ///---Checking Account---//
        
        System.out.println("Checking ammount of this account");
        System.out.print("Enter Checking account number:");
        int checkAccount=sc.nextInt();
        CheckingAccount check=new CheckingAccount(checkAccount,acblance);
        check.transectionId();
        check.transectionAmmount();
        
        ///-----Loan amount---///
        
        System.out.println("Account loan infoemation:");
        System.out.println("Enter Account Number:");
        int loanAccount=sc.nextInt();
        System.out.println("Enter balance:");
        double loanbalance=sc.nextDouble();
        Loan loan=new Loan(loanAccount,loanbalance);
        loan.display();
        
        
        ///-------fOR ATM-----///
        
        System.out.println("Atm Information:");
        System.out.print("Enter Account number:");
        int atmaccount=sc.nextInt();
        System.out.print("Enter ammount:");
        double atmAmmount=sc.nextDouble();
        System.out.print("Enter Pin number:");
        int atmpin=sc.nextInt();
        ATM atm=new ATM(atmaccount,atmAmmount,atmpin);
        atm.transectionId();
        atm.transectionAmmount();
        atm.display();
        
        
        ///////------Employe information-----/////
        
        ArrayList<Employe>employe=new ArrayList<Employe>();  //ArrayList for Employe
        System.out.print("How many employe information:");
        int a=sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < a; i++) {
            System.out.println("Enter employe "+(i+1)+" Information:");
            System.out.print("Enter Employe name:");
            String empName=sc.nextLine();
            System.out.println("Enter Employe id:");
            int empID=sc.nextInt();
            
            employe.add(new Employe(empName,empID));
            sc.nextLine();
            }
        for (int i = 0; i < n; i++) {
            System.out.println("Employe "+(i+1)+" Information:");
            System.out.println("Name:"+employe.get(i).getName());
            System.out.println("EmployeID:"+employe.get(i).getEmployeId());
            System.out.println("\n");
        }
        
        ///---Search information by Employe id number---//
        
        System.out.print("Search Enploye by ID.Enter EMPLOYE ID:");
        int ssid=sc.nextInt();
        int flag=0;
        
        for (int i = 0; i < employe.size(); i++) {
            if(ssid==employe.get(i).getEmployeId()){
                System.out.println("Found employe");
                flag=1;
                break;
            }
            
        }if(flag==0){
             System.out.println("Not Found.");
        }
        
        ////---Update information---///
        
        System.out.println("Upadate Employe information:");
        System.out.print("Enter Index:");
        int index=sc.nextInt();
        System.out.print("Enter Employe Name:");
        sc.nextLine();
        String uName=sc.nextLine();
        System.out.print("Enter update Employe number:");
        int uempID=sc.nextInt();
        
        
        employe.get(index).setName(uName);
        employe.get(index).setEmployeId(uempID);
        
        
        System.out.println("Information After Update:");
        for (int i = 0; i < employe.size(); i++) {
            System.out.println("Information of Player: "+(i+1));
            System.out.println("Name: "+employe.get(i).getName());
            System.out.println("ID: "+employe.get(i).getEmployeId());                       
        }
        //Delete Employe information
        System.out.println("Which Employe information you want to delete:");
        System.out.print("Enter index:");
        int delIndex=sc.nextInt();
        
        employe.remove(delIndex);
        
        System.out.println("All Employe information After delete: ");
        for (int i = 0; i < employe.size(); i++) {
            System.out.println("Information of Player: "+(i+1));
            System.out.println("Name: "+employe.get(i).getName());
            System.out.println("Jersy number: "+employe.get(i).getEmployeId());            
            System.out.println("\n");
        }   
        
    }
    
}

public class Coustomer extends Account {
    private String name;
    private String address;
    private String contactNumber;
    

    public Coustomer(String name, String address, String contactNumber,int account,double balance ){
        super(account,balance);
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void contactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getContactNumber(){
        return contactNumber;
    }

}

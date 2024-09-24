public class Employe {
    private String name;
    private int employeId;

    public Employe(String name, int employeId) {
        this.name= name;
        this.employeId = employeId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmployeId(int employeId){
        this.employeId=employeId;
    }
    public String getName(){
        return name;
    }
    public int getEmployeId(){
        return employeId;
    }
}

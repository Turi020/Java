package at.turancan.Handy;

public class Sim {
    private int ID;
    private String number;

    public Sim( String number, int ID){
        this.number=number;
        this.ID=ID;
    }
    public void docall(String number){
        System.out.println("SIM" + ID + "" + this.number + "is calling");
    }

    public void setNumber (String number){
        this.number=number;
    }
    public int getID(){
        return ID;
    }
    public String getNumber(){
        return number;
    }
}

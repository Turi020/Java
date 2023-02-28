package at.turancan.basics.xxx.examples.cars;

public class Engine {
 public enum TYPE {Diesel,GAS}
    private int horsepower;
 private TYPE type;


    public Engine(int horsePower,TYPE type) {
        this.horsepower = horsePower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("motor is running with"+amount);
    }
    public int getHorsepower (){
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}

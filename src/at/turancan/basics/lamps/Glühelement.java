package at.turancan.basics.lamps;

public class Glühelement {
    private String name;
    private String color;
    private boolean isOn;
    private double powerConsumption;

    public Glühelement (String name, String color) {
        this.name= name;
        this.color=color;
        this.isOn=false;
        this.powerConsumption=0.0;
    }
}

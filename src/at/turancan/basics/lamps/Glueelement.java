package at.turancan.basics.lamps;

public class Glueelement {
    private String name;
    private String color;
    private boolean isOn=false;
    private double powerConsumption;
    private double overallPowerConsumption;


    public Glueelement (String name, String color, double powerConsumption) {
this.name=name;
this.color= color;
this.powerConsumption=powerConsumption;
this.overallPowerConsumption=overallPowerConsumption;
this.isOn=false;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getOverallPowerConsumption() {
        return overallPowerConsumption;
    }

    public void setOverallPowerConsumption(double overallPowerConsumption) {
        this.overallPowerConsumption = overallPowerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }


    }


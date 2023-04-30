package at.turancan.basics.lamps;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String NameLamp;
    private double overallPowerConsumption;
    private List <Glueelement> glueElement;
    private Glueelement getGlueelement;



    public Lamp(String NameLamp){
        this.NameLamp=NameLamp;
        this.overallPowerConsumption=overallPowerConsumption;
        this.glueElement= new ArrayList<>();


    }
    public void addLamp (Glueelement glueelement) {
        this.glueElement.add(glueelement);

    }
    public Glueelement getGetGlueelement(){
        return getGlueelement;
}

    public void setGetGlueelement (Glueelement getGlueelement) {
        this.getGlueelement=getGlueelement;
    }
    public String getNameLamp(){
        return NameLamp;
    }
    public void setNameLamp (String nameLamp) {
        this.NameLamp=NameLamp;
    }

    public List<Glueelement> getGlueElement() {
        return glueElement;
    }
    public void setGlueElement(List<Glueelement>glueelement){
        this.glueElement=glueelement;
    }

    public double getOverallPowerConsumption() {
        return overallPowerConsumption;
    }

    public void setOverallPowerConsumption(double overallPowerConsumption) {
        this.overallPowerConsumption = overallPowerConsumption;
    }
    public void turnOn(){
        for (int i = 0; i < glueElement.size(); i++) {
            if (this.glueElement.get(i).isOn()){
                System.out.println("Mein Name ist Bernd"+ this.glueElement.get(i).getName() + "Ich bin bereits eingeschaltet");
                continue;
        }
            this.glueElement.get(i).turnOn();
            this.glueElement.get(i).setOverallPowerConsumption(this.glueElement.get(i).getOverallPowerConsumption()+ this.glueElement.get(i).getPowerConsumption());

        }
    }
    public void turnOff() {
        for (int i = 0; i < glueElement.size(); i++) {
            if (!this.glueElement.get(i).isOn()) {
                System.out.println("Mein Name ist Bernd" + this.glueElement.get(i).getName() + "Ich bin nicht eingeschaltet");
                continue;
            }
            this.glueElement.get(i).turnOff();

        }
    }
    public double getTotalPowerUsage(){
    double overallPowerConsumption=0;
        for (int i = 0; i < glueElement.size(); i++) {
            overallPowerConsumption = this.glueElement.get(i).getOverallPowerConsumption();
            
        }
        return overallPowerConsumption;
    }
     public void printNamesOfLightElements(){
    for (int i = 0; i < glueElement.size(); i++) {
        System.out.println(this.glueElement.get(i).getName());
        
    }
}
}

package at.turancan.basics.xxx.examples.cars;

public class Car {
    private int basePrice;
    private String color;
    private int baseConsumption;
    private int range;
    private int maxSpeed;
    private int manufacturerDiscount;

    public Car (String c, int maxS, int baseP, int baseC){
        this.color=c;
        this.maxSpeed=maxS;
        this.baseConsumption=baseP;
        this.basePrice=baseP;

    }

    public void Price (){
        this.basePrice=80000;
        this.manufacturerDiscount = 4;
        this.baseConsumption=412;
        this.range=40000;
        if (this.range<50000){
            System.out.println(this.baseConsumption);

        } else if (this.range>=50000){
    }

}

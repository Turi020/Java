package at.turancan.Handy;

public class Phone {
    private String name;
    private Sim sim;
    private String color;
    private String number;
    private Camera camera;
    private SD_memo sdMemo;


    public Phone(String name, String color, String number, Camera camera, SD_memo sdMemo,){
        this.camera=camera;
        this.color=color;
        this.name=name;
        this.sim=sim;
        this.sdMemo=sdMemo;
        this.number=" ";
    }
}


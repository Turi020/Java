package at.turancan.Handy;

public class Main   {
    public static void main (String [] args) {

        Sim sim=new Sim("5213",1);
        SD_memo sdMemo=new SD_memo(2000);
        Camera camera=new Camera(2040);
        Phone phone= new Phone(camera,sim,sdMemo);
    }
}

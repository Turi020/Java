package at.turancan.basics.lamps;

public class main {
    public static void main(String [] args){
        lamp l1= new lamp();
        Glühelement ge1 = new Glühelement("Null","Blau");
        Glühelement ge2 = new Glühelement("Eins","Rot");
        Glühelement ge3 = new Glühelement("Zwei","Weiß");
        Glühelement ge4 = new Glühelement("Drei","Schwarz");
        Glühelement ge5 = new Glühelement("Vier","Pink");

        l1.addLightElement(ge1);
        l1.addLightElement(ge2);

        ge1.turnOn();
        ge2.turnOn();
        System.out.println(l1.turnAllOn());
        System.out.println(l1.getOverallPowerUsage());
        System.out.println(l1.printNamesOfLightElements());
    }
}

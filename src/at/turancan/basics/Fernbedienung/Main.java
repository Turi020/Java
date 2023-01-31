package at.turancan.basics.Fernbedienung;


    public class Main {
        public static void main(String[] args){
            Remote r1 = new Remote ();
            Battery b1 = new Battery (5, 100);
            b1.getStatus();
            b1.turnON();
            b1.turnOFF();

        }
    }







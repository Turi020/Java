package at.turancan.Rechner;

public class Main {
    public static void main(String[] args){
        RootCalculator rootcalc = new RootCalculator();
        Calculator cal= new Calculator();
        ScientificCalculator scie= new ScientificCalculator();

        System.out.println(cal.division(10,2));
        System.out.println(cal.addition(5,9));
        System.out.println(cal.multiplication(5,1));
        System.out.println(cal.subtraction(9,7));

    }
}

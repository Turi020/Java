package at.turancan.Konto;

public class Savingsbook extends Baseaccount{
    @Override
    public double withdraw (double amount ){
        if ((getBalance()-amount)>0){
            return super.withdraw(amount);
        }else {
            System.out.println("Keine Deckung");
            return 0;
        }
    }
}

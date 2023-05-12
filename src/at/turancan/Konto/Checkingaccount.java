package at.turancan.Konto;

public class Checkingaccount extends Baseaccount{
private int limit;
public Checkingaccount(int limit){
this.limit=limit;
}
@Override
    public double withdraw (double amount ){
    if((getBalance() - amount)>(limit * -1)){
        System.out.println("Withdrawn" + amount + "Euro");
        return super.withdraw(amount);
    } else {
        System.out.println("Leider keine Deckung!");
        return 0;
    }
}
}

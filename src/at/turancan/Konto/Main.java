package at.turancan.Konto;

public class Main {
    public static void main ( String [] args){
Baseaccount base = new Baseaccount();
Checkingaccount checking = new Checkingaccount(100);
Savingsbook save = new Savingsbook();

save.deposit(100);
save.withdraw(100);
    }
}

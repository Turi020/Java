package at.turancan.Konto;

public class Baseaccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void deposit (double amount) {
        System.out.println("Deposited:" + amount);
        this.balance += amount;
    }

    public double withdraw ( double amount) {
        System.out.println("Withdrawn:" + amount);
        this.balance -= amount;
        return amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

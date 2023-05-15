package at.turancan.Konto;

public class Creditaccount {
    private double balance;

    public Creditaccount(double amount, double interstRate, double yearFactor) {
        this.balance-= amount *Math.pow((1+ interstRate/100), yearFactor);
    }
    public void payCredit (double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}



package at.turancan.basics;

        import java.util.InputMismatchException;
        import java.util.Scanner;

       public class Bankomat {
    public static void main(String[] args) {

        boolean exit = false;
        int input = 0;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Wählen sie eine option aus:");
        System.out.println("wählen sie die 1 für das Einzahlen ein:");
        System.out.println("wählen sie die 2 für das Abheben:");
        System.out.println("wählen sie die 3 für Kontostand einzusehen:");
        System.out.println("wählen sie die 4 um es zu beenden:");
        System.out.println();
        while (!exit){


            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println();
                    System.out.println("Wählen Sie den Wert, den Sie an ihr Konto überweisen wollen.");
                    int depositedAmount = scanner.nextInt();
                    balance = balance + depositedAmount;
                    System.out.println("Kontostand nach Überweisung: " + balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Wählen Sie den Wert, den Sie an ihr Konto abheben wollen.");
                    int withdrawedAmount = scanner.nextInt();
                    if (balance < withdrawedAmount) {
                        System.out.println("Sie können nicht mehr Geld abheben, als Sie besitzen!");
                        System.out.println("Kontostand nach unerfolgreiche Abhebung: " + balance);
                        System.out.println();
                    } else {
                        balance = balance - withdrawedAmount;
                        System.out.println("Kontostand nach Abhebung: " + balance);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Jetztigen Kontostand:" + balance);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Sie werden gleich abgemeldet. Auf Wiedersehen!");
                    break;

                default:
                    System.out.println("Wählen Sie eine gültige Funktion aus!");
                    System.out.println();

            }

        }
    }
}
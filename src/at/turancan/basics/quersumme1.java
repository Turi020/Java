package at.turancan.basics;

public class quersumme1 {

    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1000; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }

            int rest = sum % 7;
            if (rest == 0) {
                System.out.println("numbers: " + cnt + " Quersumme: " + sum);
            }
        }
    }}
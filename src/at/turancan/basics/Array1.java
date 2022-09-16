package at.turancan.basics;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] jeff = new int[10];
int sum = 0;

        for (int i = 0; i <= jeff.length-1; i++) {
            int randomValue = random.nextInt(0, 10);
            jeff[i] = randomValue;
            System.out.println(jeff[i]);
            sum+= randomValue;

        }
        System.out.println(sum);
    }
}

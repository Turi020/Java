package at.turancan.basics;

import java.util.Random;
public class Array2 {
    public static void main(String[] args) {
        Random random= new Random();
        int[] bob= new int [50];
        int sum= 0;

        for (int i = 0; i <= bob.length-1 ; i++) {
           int randomValue = random.nextInt(0,101);
            System.out.println();
            bob[i]=randomValue;
            System.out.println(bob[i]);
            sum+=randomValue;

        }
        System.out.println(sum);
    }
}

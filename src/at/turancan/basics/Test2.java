package at.turancan.basics;

import java.util.Random;

public class Test2 {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        while (!isFinished) {
            int randomValue = random.nextInt(0, 10);
            System.out.println("Zahl:" + randomValue);

            if (randomValue == 5) {
                isFinished = true;
            }


        }
        System.out.println("Finished");


    }
}




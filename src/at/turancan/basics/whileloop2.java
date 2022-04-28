package at.turancan.basics;

import java.util.Random;

public class whileloop2 {
    public static void main (String[] args) {
        Random random =new Random();
        boolean isFinished = false;
        while (!isFinished) {
            int randomValue = random.nextInt(10, 30);
            System.out.println("Nr:" + randomValue);

            if ((randomValue == 15) || (randomValue==25))  {
                isFinished = true;
            }



        }
        System.out.println("Finished");



    }

}
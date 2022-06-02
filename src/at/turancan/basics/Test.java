package at.turancan.basics;

   import java.util.Random;

   public class Test

   { public static void main(String[] args)
   { Random random = new Random();
       int randomNumber0 = random.nextInt(1000);

       int randomNumber1 = random.nextInt(randomNumber0);

       System.out.println (randomNumber0);

       System.out.println (randomNumber1);

       for (int i = randomNumber0; i> randomNumber1; i--) System.out.println(i); }


   }
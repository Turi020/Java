package at.turancan.basics;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a=7;
        int b = 8;
        int c =1;
        int d =10;

        int [] data = {7,8,1,10};

        int tmp = data [3];
        System.out.println(tmp);


        int [] userInput = new int[10];

        Scanner scanner = new Scanner(System.in);

        //dont repeat yourself Dry


        System.out.println(userInput);
        String[] names={"hans","paul","sepp"};

        String myName ="hans";
        char [] chars =myName.toCharArray();
        System.out.println(chars[0]);




        System.out.println(names[1]);
        userInput[0]= scanner.nextInt();
        userInput[1]= scanner.nextInt();
        userInput[2]= scanner.nextInt();
        userInput[3]= scanner.nextInt();
        System.out.println(userInput);
    }
}

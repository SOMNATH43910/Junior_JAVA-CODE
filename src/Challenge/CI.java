package Challenge;

import java.util.Scanner;

public class CI {
    //compound interest

    public static void main(String[] args) {

        System.out.println("Welcome to Compound Interest Calculator: ");
        Scanner input= new Scanner(System.in);

        System.out.print("Enter your principle Amount RS: ");
        int pi = input.nextInt();

        System.out.print("Now tell me your rate of Interest: ");
        float rate = input.nextFloat();

        System.out.print("Now tell me for how many years are you borrowing this money: ");
        float year = input.nextFloat();
        // formula ---------- method call power call using is math function
        double compound = pi * Math.pow( ( 1+ rate /100),year);

        System.out.println("your compound is Rupees:" + compound);

    }
}

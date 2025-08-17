package Challenge;

import java.util.Scanner;

public class SI {
    // simple interest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SI calculator ");

        System.out.print("Enter your principle Amount RS: ");

        int pi = input.nextInt();
        System.out.print("Now tell me your rate of Interest: ");
        float rate = input.nextFloat();

        System.out.print("Now tell me for how many years are you borrowing this money: ");
        float year = input.nextFloat();

        float interest = (pi * rate * year)/100;
        System.out.println("\n \n your SI interest RS is :" + interest);

    }
}

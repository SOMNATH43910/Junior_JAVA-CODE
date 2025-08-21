package Operator_Day4.LogicalOpp;

import java.util.Scanner;

public class BusDiccount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to PM BUS service ");

        System.out.println("kindly Enter Your Age: ");
        int age = input.nextInt();

        System.out.println("ARE you are MALE / FEMALE? 👉🏻(True / False)");
        boolean isFemale = input.nextBoolean();

    // condition statement start
        if (age < 5) {
            System.out.println("You got 75% discount");
        } else if(isFemale){
            System.out.println("You got 50% Discount");
        } else if( age > 60 && !isFemale) {
            System.out.println("You got 25% discount");

        }else {
            System.out.println("You got No Discount");
        }

    }
}

package Challenge;

import java.util.Scanner;

public class Gread {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Mark Checker");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Percentage: ");

        float percentage  = input.nextFloat();

        if (percentage >= 90){
            System.out.println("Great, your Got A :");
        } else if ( percentage >= 75){
            System.out.println("Good, Your Got B :");
        } else if (percentage >= 60) {
            System.out.println("You have got C , work harder next time :");
        } else if (percentage >= 30) {
            System.out.println("You have got D , you Seriously need to Work hard: ");
        }else{
            System.out.println("Sorry You have Failed the test you Got F: ");
        }
    }
}

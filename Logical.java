package if_Eslse_Day5;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Welcome to Ticket Discount Calculator :");

        System.out.println("Please  enter your age :");
        int age=user.nextInt();

        System.out.println("Kindly Tell me are you Female ? (True /False) : ");
     boolean isFemale = user.hasNextBoolean();

        // condition user 
        
        if (age < 5){
            System.out.println("You got 75% discount:");
            
            
        } else if (isFemale) {
            System.out.println("you got 50% discount:");
            
        } else if ( age >  60 && !isFemale) {
            System.out.println("You got 25% discount ");
            
        } else {
            System.out.println("You got No discount:");
        }

    }

}

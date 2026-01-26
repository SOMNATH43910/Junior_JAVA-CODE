package LogicalOPP;

import java.util.Scanner;

public class Ticket_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ticket Discount Cal: ");
        System.out.println("Please enter your AGE: ");
        int  age = sc.nextInt();

        System.out.println("Are you a Female ? => (True / False ): ");
          boolean isFemale = sc.nextBoolean();


          if (age < 5){
              System.out.println("you got 75% Discount: ");
          } else if (isFemale) {
              System.out.println("You got 50% Discount:");
              
          } else if (age > 60 && !isFemale) {
              System.out.println("You got 25 % Discount ");
              
          }else{
              System.out.println("you got NO Discount");
          }


    }
}

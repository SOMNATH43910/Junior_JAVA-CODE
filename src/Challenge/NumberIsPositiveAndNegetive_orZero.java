package Challenge;

import java.util.Scanner;

public class NumberIsPositiveAndNegetive_orZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Number Checker\n");

        System.out.println("Please enter your Number :");

        int num = input.nextInt();

        if ( num > 0){
            System.out.println("Your Number is Positive: ");

        } else if ( num == 0) {
            System.out.println("Your number is Zero:");
        } else {
            System.out.println("your Number is Negative: ");
        }
    }
}

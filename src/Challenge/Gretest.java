package Challenge;

import java.util.Scanner;

public class Gretest {

    public static void main(String[] args) {

        System.out.println("Welcome to Check Greatest Number Checker Simulator:");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your 1st number: ");
        int first = input.nextInt();
        System.out.print("Enter your second Number: ");
        int second = input.nextInt();
        System.out.print("Enter your 3rd Number: ");
        int third = input.nextInt();

        if (first >= second  && first >= third){
            System.out.println(first +  "  First is the Greatest Number 😈");


        } else if ( second >=third && second >= first) {
            System.out.println( second +  "  Second is the Greatest Number:");
            
        }else {
            System.out.println(third +  "  Third is the Greatest Number:");
        }
    }
}

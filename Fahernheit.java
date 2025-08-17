package Challenge;

import java.util.Scanner;

public class Fahernheit {

    // fahernheit celcious
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter:");

        System.out.print("Enter your temp in F: ");
        float f = input.nextFloat();

        float cel =(f -32) *5 /9;

        System.out.println("Your Temperature is:" + cel +"C");

    }


}

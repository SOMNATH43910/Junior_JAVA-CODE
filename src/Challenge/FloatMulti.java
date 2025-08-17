package Challenge;

import java.util.Scanner;

public class FloatMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Floating Multiplication Calculation HUB \n");
        System.out.print("Enter the First Floating Number: ");
        double first = input.nextDouble();
        System.out.print("Now pls enter Second Number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is: " + mul);


    }
}

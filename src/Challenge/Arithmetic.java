package Challenge;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Welcome to calculation HUB💐");
        Scanner input = new Scanner(System.in);
        System.out.print ("Please Enter your First Number: ");
       int a = input.nextInt();
        System.out.println("Great, Kindly Enter your Second Number: ");
        int b = input.nextInt();
        // result
        System.out.println("\n--- Results ---");

        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b) :" + (a-b));
        System.out.println("Multiplication ( a * b):" + (a * b));
        System.out.println("Division (a / b) :" + ( a / b));

         // Handle division by zero

        if (b != 0) {
            System.out.println("Division (a / b): " + (a / b));
            System.out.println("Modulus (a % b): " + (a % b));
        } else {
            System.out.println("Division and Modulus cannot be performed with divisor 0.");
        }

        input.close();
    }
}





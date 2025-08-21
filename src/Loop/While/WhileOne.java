package Loop;

import java.util.Scanner;

public class WhileOne {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num = num + 1; // Updating the Condition
        }
        //Reverse counting
        System.out.println("This is Reverse Numbers: ");
        int count = 10;
        while (count >= 1) { // condition
            System.out.println(count); // print the output
            count = count - 1; // updating the condition
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int i=0;
        while (i<5){
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i = i + 1;

        }
    }
}
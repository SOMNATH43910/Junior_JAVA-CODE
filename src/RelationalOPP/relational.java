package RelationalOPP;

import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Driving LICENCE DASHBOARD: ");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age>=18) {
            System.out.println("You are eligible to apply Driving LICENCE ");

        }else{
            System.out.println("You are not eligible- TryNext Year ");
        }
    }
}

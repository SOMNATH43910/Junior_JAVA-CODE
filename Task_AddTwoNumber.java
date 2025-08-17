package Day3;

import java.util.Scanner;

public class Task_AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator📱:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= input.nextInt();
        System.out.println("Now, Enter the sec number: ");
        int b= input.nextInt();
        //sum is concatenate:
        int sum=a+b;
        System.out.println("The Answer is : " +sum);


    }
}

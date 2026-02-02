package Challenge;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd & Even Number Checker------------->");

        System.out.print("Hi User,Kindly Enter the Number :");

        int num = input.nextInt();

        if(num % 2==0){
            System.out.println("Your Number is an Even✅ ");



        }else{
            System.out.println("Your Number is Odd ❌ ");
        }

    }
}

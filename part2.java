package if_Eslse_Day5;

import java.util.Scanner;
// use relational Operator
public class part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Driving Licence Portal: ");


        System.out.print(" Please enter your age : ");

        int age = input.nextInt();

        if(age >=18){
            System.out.println("You are eligible to drive ");

        }else{
            System.out.print("beta tu gaand mara");
        }
    }
}

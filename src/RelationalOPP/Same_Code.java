package RelationalOPP;
import java.util.Scanner;

public class Same_Code {
    public static void main(String[] args) {

        System.out.println("Welcome to SR Driving School: ");
        Scanner  sc = new Scanner(System.in);

        System.out.print("Pls Enter your Age: ");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You are eligible to drive: ");
        }else
        {
            System.out.println("Your are not eligible to Drive:");
        }
        }

    }

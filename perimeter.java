package Challenge;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.print("Pls Enter all 4 Sides in cms: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double perimeter = a+ b+ c+ d;
        System.out.println("Perimeter Of your rectangle is :" + perimeter + "cm");



    }

}

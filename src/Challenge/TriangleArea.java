package Challenge;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area calculator\n ");
        System.out.println("Please enter your base in cms: ");
        double base= input.nextDouble();
        System.out.print("Now, Enter your perpendicular height in CMS: ");
        double height= input.nextDouble();

        double area = 0.5* base * height;

        System.out.println("The Area of your triangle is: " + area + "cms2");



    }
}

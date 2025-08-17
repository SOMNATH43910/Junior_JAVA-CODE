package Challenge;

import java.util.Scanner;

public class CalC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator📱 ");
        System.out.print("Plse Enter The 1St Number: ");
        int  a = input.nextInt();
        System.out.print("Plse Enter The 2nd Number: ");
        int  b = input.nextInt();
        int Sum =  a + b;
        System.out.println(" Congratulations, your calculation value is: " + Sum );
        int Mul =  a * b;
        System.out.println(" Congratulations, your calculation value is: " + Mul );
        int Div = a/b;
        System.out.println(" Congratulations, your calculation value is: " + Div );
        int Sub = a - b;
        System.out.println(" Congratulations, your calculation value is: " + Sub );



    }
}

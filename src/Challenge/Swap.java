package Challenge;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        System.out.println("welcome to the Swapping station\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print(" enter the value A: "); // a = 10
        int a = input.nextInt();

        System.out.print(" enter the value B:"); // b = 20
        int b = input.nextInt();

        int c = a;
                a=b;
                b=c;

        System.out.println(" your swapping  is done : ");

        System.out.println(" now check your value, A is: " + a);
        System.out.println(" now, check your value, B is: " + b);


                        

    }
}

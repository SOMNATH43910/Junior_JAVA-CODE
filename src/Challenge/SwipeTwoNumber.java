package Challenge;

import java.util.Scanner;

public class SwipeTwoNumber {
    public static void main(String[] args) {
        //swap the two number
        Scanner input = new Scanner(System.in);
        System.out.println("wellcome to swapping station\n \n");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b= input.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("Value of A is: "+a);
        System.out.println("Value is B is:  "+b);
        System.out.println("Swapping is Done:👍🏻");

    }
}

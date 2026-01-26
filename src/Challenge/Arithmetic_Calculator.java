package Challenge;
import java.util.Scanner;
// class
public class Arithmetic_Calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator :");
        // Start
        System.out.print("ENTER THE FIRST NUMBER : ");
        int F = input.nextInt();
        System.out.print("ENTER THE SCECOUND NUMBER : ");
        int S = input.nextInt();
// INTEGER VALUE
        int add = F+S;
        int sub = F-S;
        int mul = F*S;
        int div = F/S;
        // add modules opp
        int mod = F % S;
        System.out.println("Addition is Successfully " + add);
        System.out.println("Substation is Successfully " + sub);
        System.out.println("Multiplication is Successfully " + mul);
        System.out.println("Division is Successfully " + div);
        // MOD FUNCTION
        System.out.println("Modules is Successfully " + mod);
    }
}

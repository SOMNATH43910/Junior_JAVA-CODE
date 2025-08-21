package Function;

public class Function {

    public static void main(String[] args) { // this is  the main method - AFTER RUN
        printFirstPattern(); // function call ( search this method )
        printSecondPattern(); // function call
        printThirdPattern();  // function call
        System. out.println("---Method call successful ----");
        // after search and print all the methods at the end, this print section search End

    }

    public static  void printFirstPattern(){ // 1st method invoke
        System.out.println("    *");
        System.out.println("   **");
        System.out.println("  ***");
        System.out.println(" ****");
        System.out.println("*****");
        System.out.println("Hi -- im right, half pyramid");
    }

    public static  void printSecondPattern(){ // 2nd method invoke
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("Hi----im reverse pyramid ");
        }
    public static  void printThirdPattern(){ // 3rd method invoke
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println(" hi-- I am left half pyramid \n  ");
    }



}

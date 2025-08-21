package Operator_Day4;

public class Increment {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        //post increment
        a++;
        System.out.println(a);
        //pre increment
        ++a;
        System.out.println(a);


     // easy way to understand
        System.out.println("Welcome to pre - increment- ");
       int  p = 10;
        System.out.println(p++);
        System.out.println(p);


        // post increment
        System.out.println("Welcome to post - increment- ");
        int q = 20;
        System.out.println(++q);

        System.out.println(q);


    }
}

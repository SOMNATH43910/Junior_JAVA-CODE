package Operator_Day4;

public class Unary {
    public static void main(String[] args) {
        int x=5;
        int y=(-x);
        int z=(-y);
        System.out.println(y);


        int a = 5;
        a=a+1;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println("wating inc");
      int p= 10;
        System.out.println(p++);

        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
        System.out.println( "dec");
        int q=20;
        System.out.println(--q);
        System.out.println(q);
        System.out.println(q--);
        System.out.println(q);
    }
}
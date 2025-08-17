package Challenge;

public class UnaryAA {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z= -y;
// addition example Previous Code
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//ShortHand  code :
        int a = 5;
        a = a+1;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        // a++ means add the value to the same variable/ container
    a++;
        System.out.println(a);

    // same
        ++a;
        System.out.println(a);

        // new variable
        System.out.println("Watching Increment ");
        int p = 5;
        // p++ means use first , then Add Next
        System.out.println(p++);
        System.out.println(p);

        // ++p means use first add , then use Next
        System.out.println(++p);
        // its use first
        System.out.println(p);



    }
}

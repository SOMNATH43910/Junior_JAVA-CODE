package Challenge;
import java.util.Scanner;

public class loopExam {
    public static void main(String[] args) {
        System.out.println("hello to example to while loop prog");
 int num = 1;
 while( num <= 10) {
     System.out.println(num);
     num = num + 1;
 }
        // reverse counting
        System.out.println(" these are the reverse counting");
        int count = 500;
        while (count >=200){
            System.out.println(count);
            count = count -1;
        }
        // User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The num: ");
        int i = 0;
        while ( i < 5 ){
            int inp = input.nextInt();
            System.out.println(" Number is: "+ inp);
            i = i +1;
        }

    }
}



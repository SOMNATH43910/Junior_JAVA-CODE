package Challenge;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Check:");
        Scanner input = new Scanner(System.in);

        System.out.print("Input the year to check  it is Leap or Not: ");

        int year = input.nextInt();

        if( year % 400 ==0 ||(year % 4 ==0 && year % 100 !=0)){
            System.out.println("your year is Leap year : ");
        }else{
            System.out.println("your year is Not Leap year :");
        }
    }
}

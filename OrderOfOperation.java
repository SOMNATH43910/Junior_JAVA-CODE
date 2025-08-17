package Operator_Day4;

public class OrderOfOperation{
    public static void main(String[] args) {
        System.out.println("Welcome to OfD: ");

        System.out.println(2-3*3); // () ➡️ X-X2 ➡️ / ➡️ * ➡️ + ➡️ -  ✅
        //followed by BODMAS operation

        System.out.println(9/3/3); // L ➡️ R
        // if is same operation are there so always remember BODMAS are followed the LEFT ➡️ RIGHT rules:

        // example some expression is there
        System.out.println(9/3/3); // so compiler 1ST rule () is the independent expression
        //that's the way compiler compile the 1st evolute bracket expression👉🏻 (4/5)


        // example some expression is there
        System.out.println(9/(3/3+2)); //so compiler 1ST rule () is the independent expression
        // 1st compiler find the BODMAS rules - meas // () ➡️ X-X2 ➡️ / ➡️ * ➡️ + ➡️ -  ✅

        // 1st find () -> (3/3+2) how to it possible. yes it's possible  because compiler fist use

        //➡️ / ➡️ * ➡️ + ➡️ -  ✅ means (3/3) = 1✅
        // find any one is there no ❌ then (1+2) is there is bracket .
        //use the rule () first  -> (1+2)=3✅  but 3 is there is (3) 👈 3 is there Single number then compiler ignore the Bracket.
        // Then last number is 9/2 then compiler followed the same rules  meas // () ➡️ X-X2 ➡️ / ➡️ * ➡️ + ➡️ -  ✅ meas 9/2








    }
}

/**
 * Exercise: https://www.youtube.com/watch?v=9HBtq-RvZhw&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=8
 * @author Farida Fatali
 */

/*
Get the customer's km information.
The cost per km is 2.20 tl, the opening of a taximeter is 10 tl.
If the amount is less than 20 tl, then the cost will be 20 tl.
 */


import java.util.Scanner;

public class TaximeterCalculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many kilometers? : ");
        double km = scanner.nextDouble();

        double cost = 2.20;
        double amount = 10 + (km * cost);

        if (amount <= 20){
            System.out.println("The amount: " + 20 + " TL");
        } else {
            System.out.println("The amount: " + amount + " TL");
        }

//        OR
//        amount = (amount <= 20) ? 20 : amount;
//        System.out.println("Amount: " + amount);

    }
}

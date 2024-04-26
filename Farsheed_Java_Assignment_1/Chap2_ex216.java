/*
 * 
 * 
 * 2.16 (Comparing Integers) Write an application
 *  that asks the user to enter two integers, obtains
 *  them from the user and displays the larger number 
 * followed by the words "is larger".
 *  If the numbers are equal, print the message "These numbers are equal". 
 */
import java.util.Scanner;

public class Chap2_ex216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter two integers
        System.out.print("Enter the first int: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second int: ");
        int num2 = input.nextInt();

        // displays the larger number 
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger");
        
        // numbers are equal
        } else {
            System.out.println("These numbers are equal");
        }
        
        input.close();
    } // main
}    // class

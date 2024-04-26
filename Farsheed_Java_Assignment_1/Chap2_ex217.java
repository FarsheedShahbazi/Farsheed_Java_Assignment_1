
/*
 * (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum,
 *  average, product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15. 
 * [Note: The calculation of the average in this exercise should result in an integer representation of the average.
 *  So, if the sum of the values is 7, the average should be 2, not 2.3333….]"
 */

import java.util.Scanner;

public class Chap2_ex217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        //  sum
        int sum = num1 + num2 + num3;

        // average
        int average = sum / 3;

        //  product
        int product = num1 * num2 * num3;

        // smallest or largest
        int smallest = num1;
        int largest = num1;

        if (num2 < num1) {
            smallest = num2;
        }
        else if (num3 < num1) {
            smallest = num3;
        }
        else {
            smallest = num1;
        }

        if (num2 > num1) {
            largest = num2;
        }
        else if (num3 > num1) {
            largest = num3;
        }
        else {
            largest = num1;
        }

        // results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    }
}
/*
 * (Sides of a Triangle) Write an application that reads three nonzero values entered by the user
 *  and determines and prints whether they could represent the sides of a triangle.
 */

import java.util.Scanner;

public class Chap4_ex436 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // values
        System.out.println("Enter three  numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // triangle or not?
        boolean triangle = (num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1);

        //  result
        if (triangle) {
            System.out.println(" triangle!");
        } else {
            System.out.println("no trianle!");
        }

        input.close();
    } // main
} // class
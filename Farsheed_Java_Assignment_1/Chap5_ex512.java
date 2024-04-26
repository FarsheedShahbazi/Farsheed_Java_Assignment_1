/*
 * (Calculating the Product of Odd Integers) Write an application that calculates the product of the odd integers from 1 to 15.
 */

 import java.util.Scanner;

public class Chap5_ex512 {
  
    public static void main(String[] args) {
        int result = 1;

        // loops from 1 to 15 by 2
        for (int i = 1; i < 15; i += 2) {
            result *= i; 
        }

        // result
        System.out.println("result: " + result);
    }
}

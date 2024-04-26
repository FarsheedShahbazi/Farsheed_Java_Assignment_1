/*
 * (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
 *  [Hint: Use the remainder operator. An even number is a multiple of 2. 
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 */

import java.util.Scanner;

public class ex225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // input
        System.out.print("number: "); 
        int num = input.nextInt(); 

        // condition even or odd
        if (num % 2 == 0) { 
            System.out.println("even"); 
        } else { 
            System.out.println("odd"); 
        }

        input.close(); 
    }
    
}

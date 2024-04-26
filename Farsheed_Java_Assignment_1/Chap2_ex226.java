/* 2.26
 * (Multiples) Write an application that reads two integers,
 * determines whether the first is a multiple of the second and prints the result. 
 * [Hint: Use the remainder operator.]
 */

 import java.util.Scanner;

 public class ex226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // reads two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        // determines whether the first is a multiple of the second and prints the result. 
    
        if (num1 % num2 == 0) {
            System.out.println("is multiple");
        } else {
            System.out.println("is not multiple");
        }

        input.close();
    } // Main
 } //Class

/*
 * (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints
 *  the number of negative numbers input, the number of positive numbers input and the number of zeros input.
 */

 import java.util.Scanner;

public class Chap2_ex232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNegative = 0;
        int totalPositive = 0;
        int totalZero = 0;

        // inputs five numbers 
        for (int i = 0; i < 5; i += 1) {
            System.out.print("Enter numbers: ");
            int num = input.nextInt();

            if (num < 0) {
                totalNegative += 1;
            } else if (num > 0) {
                totalPositive += 1;
            } else {
                totalZero += 1;
            }
        }
        
        // print 
        System.out.println("Total Negative: " + totalNegative);
        System.out.println("Total Positive: " + totalPositive);
        System.out.println("Total Zero: " + totalZero);
            
        input.close();
    }   
}
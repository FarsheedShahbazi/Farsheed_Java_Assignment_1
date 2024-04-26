/*
 *  (Largest and Smallest Integers) Write an application that reads 
 * five integers and determines and prints the largest and smallest integers in the group.
 *  Use only the programming techniques you learned in this chapter.
 */

import java.util.Scanner;

public class Chap2_ex224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five number:");

        int firstNum = input.nextInt();
        int smallest = firstNum;
        int largest = firstNum;

        for (int i = 1; i < 5; i +=1) {
            int num = input.nextInt();
            
            // condition
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        
        // print
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        input.close();
    } // main
} // class
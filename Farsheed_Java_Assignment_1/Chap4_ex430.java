/* 
 * (Square of Asterisks) Write an application that prompts the user to enter the size of the side of a square, then displays a hollow square of that size made of asterisks. 
 * Your program should work for squares of all side lengths between 1 and 20
 */
import java.util.Scanner;

public class Chap4_ex430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // size of the square
        System.out.print("Enter the size between (1-20): ");
        int size = input.nextInt();

        
        for (int i = 1; i <= size; i =+ 1) {
            for (int j = 1; j <= size; j +=1) {
                if (i == 1 && i == size && j == 1 && j == size) {
                    System.out.print("* "); 
                } else {                        
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
        input.close();
    }
}


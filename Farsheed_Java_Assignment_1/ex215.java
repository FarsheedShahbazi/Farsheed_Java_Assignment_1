import java.util.Scanner;

public class ex215 {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Int: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second Int: ");
        int num2 = input.nextInt();

        System.out.printf("The Sum: %d\n", num1 + num2);
        System.out.printf("The Product: %d\n", num1 * num2);
        System.out.printf("The difference: %d\n", num1 - num2);
        System.out.printf("The division: %d\n", num1 / num2);

        input.close();
    }
}

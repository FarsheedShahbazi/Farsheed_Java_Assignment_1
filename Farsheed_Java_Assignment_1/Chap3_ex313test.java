import java.util.Scanner;

public public class Chap3_ex313test {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee firstEmployee = new Employee("Mike", "DDD", 10000);
        Employee secondEmployee = new Employee("Farsheed", "Sh", 1000);

        // Display each employee's yearly salary
        System.out.println("Yearly salary of  Mike: " + firstEmployee.yearlySalary());
        System.out.println("Yearly salary of Farsheed: $" + secondEmployee.yearlySalary());

        // Give each employee a 10% raise
        firstEmployee.getRaise();
        secondEmployee.getRaise();

        // Display each employee's yearly salary after raise
        System.out.println("\n Salary of Mike after raise: $" + firstEmployee.yearlySalary());
        System.out.println("Salary of Farsheed after raise: $" + secondEmployee.yearlySalary());
    }
}
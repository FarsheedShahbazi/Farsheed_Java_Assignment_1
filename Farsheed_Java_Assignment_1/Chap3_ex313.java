/*
 * (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String),
 *  a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables.
 *  Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. 
 * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // firstName (get /set)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName (get / set)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // salary (get/set)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // yearly salary
    public double yearlySalary() {
        return salary * 12;
    }

    //  raise to 10%
    public void getRaise() {
        salary = salary + (salary/10);
    }
}

/**
 * @file Problem1.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab4;

/**
 * Main entrypoint for problem1.
 *
 * Ploymorphism across different classes.
 */
public class Problem1 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var employees = new Employee[3];

        employees[0] = new Employee("John", "Baker", 30_000);
        employees[1] = new HourlyEmployee("Jacob", "Beer", 300, 10);
        employees[2] = new SalesEmployee("Jack", "Com", 50000, 3000);

        for (int i = 0; i < employees.length; i++)
            System.out.printf("Employee %s salary: %f, after tax: %f\n",
                    employees[i].getFirstName(),
                    employees[i].calculatePay(),
                    employees[i].calculatePay(1000));
    }
}

/**
 * @file Problem3.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab1;

/**
 * Lab 1, Problem 3 entrypoint.
 *
 * Constructor calls with all arguments with no toString
 */
public class Problem3
{
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args)
    {
        var customer1 = new Customer("John", "Smith", "Dublin", 123);

        System.out.println(customer1);
    }
}

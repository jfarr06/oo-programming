/**
 * @file Problem1.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Main entrypoint for problem 1.
 *
 * Basic mammal class with no inheritance.
 */
public class Problem1 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var mammal = new Mammal("Lion", 0, 0, 4);

        mammal.move(5);
        mammal.slowDown(5);
    }
}

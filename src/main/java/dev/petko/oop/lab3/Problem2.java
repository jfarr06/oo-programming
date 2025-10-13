/**
 * @file Problem2.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Main entrypoint for problem 2.
 *
 * Basic bird class with no inheritance.
 */
public class Problem2 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var bird = new Bird("Pidgeon", 1, 0, true);

        bird.move(5);
        bird.slowDown(5);

        System.out.println(bird);
    }
}

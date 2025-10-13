/**
 * @file Main.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

import dev.petko.oop.CallWrapper;

/**
 * Main entrypoint for Lab3
 */
public class Main {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        CallWrapper.runMain("problem 1", Problem1::main, args);
        CallWrapper.runMain("problem 2", Problem2::main, args);
        CallWrapper.runMain("problem 3", Problem3::main, args);
        CallWrapper.runMain("problem 4", Problem4::main, args);
    }
}

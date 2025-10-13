/**
 * @file Main.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab4;

import dev.petko.oop.CallWrapper;

/**
 * Main entrypoint for Lab4
 */
public class Main {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        CallWrapper.runMain("problem 1", Problem1::main, args);
    }
}

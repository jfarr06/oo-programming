/**
 * @file Main.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop;

/**
 * Main entrypoint for ALL labs.
 */
public class Main 
{
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) 
    {
        CallWrapper.runMain("lab 1", dev.petko.oop.lab1.Main::main, args);
    }
}

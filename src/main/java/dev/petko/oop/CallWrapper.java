/**
 * @file CallWrapper.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop;

import java.util.function.Consumer;

/**
 * Class used to wrap the call of a main used for pretty printing information
 * about the call.
 */
public class CallWrapper {
    /**
     * Run the main method of a class, passing in the STDIN args.
     *
     * @param name     The name of the call.
     * @param mainFunc A reference to a void(String[]) function.
     * @param args     The arguments passed from the command line
     */
    public static void runMain(String name, Consumer<String[]> mainFunc,
            String[] args) {
        System.out.printf("========== Running %s ==========\n\n", name);

        mainFunc.accept(args);

        System.out.println();
    }
}

/**
 * @file Main.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lectures;

/**
 * Main entrypoint for all lecture based testing.
 */
public class Main {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var p1 = new Person(18, "John");

        System.out.println(p1);

        p1.setAge(22);

        System.out.println(p1);

        try {
            new Person(-1, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

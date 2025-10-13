/**
 * @file Problem4.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Main entrypoint for problem 4.
 *
 * Animal class, bird class, and mammal class with overridden methods.
 */
public class Problem4 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var animal = new Animal("Other", 5, 10);

        animal.makeSound();

        var bird = new BirdWithInheritance("Pigeon", 1, 0, true);

        bird.makeSound();

        var mammal = new MammalWithInheritance("Lion", 0, 0, 4);

        mammal.makeSound();
    }
}

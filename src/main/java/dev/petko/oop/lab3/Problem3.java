/**
 * @file Problem3.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Main entrypoint for problem 3.
 *
 * Animal class, inherited bird class and inherited mammal class usage.
 */
public class Problem3 {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var animal = new Animal("Other", 5, 10);

        animal.move(5);
        animal.slowDown(0);

        System.out.println(animal);

        var bird = new BirdWithInheritance("Pidgeon", 1, 0, true);

        bird.move(5);
        bird.slowDown(5);

        System.out.println(bird);

        var mammal = new MammalWithInheritance("Lion", 0, 0, 4);

        mammal.move(5);
        mammal.slowDown(5);

        System.out.println(mammal);
    }
}

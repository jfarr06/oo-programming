/**
 * @file animal.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Base animal class.
 */
public class Animal {
    private String species;
    private int age, speed;

    /**
     * Construct a new instance of {@link Animal}
     *
     * @param species The species of the animal.
     * @param age     The age of the animal.
     * @param speed   The speed of the animal.
     */
    public Animal(String species, int age, int speed) {
        setSpecies(species);
        setAge(age);
        setSpeed(speed);
    }

    /**
     * Gets the species of the animal.
     *
     * @returns The species of the animal.
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species of the animal
     *
     * @param species The new species of the animal.
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Gets the age of the animal
     *
     * @returns The age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the animal.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the speed of the animal.
     *
     * @returns The speed of the animal
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the animal.
     *
     * @param speed The new speed of the animal.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Increments the speed of the animal.
     *
     * @param inc The amount to increment the speed by.
     */
    public void move(int inc) {
        speed += inc;

        System.out.printf("Moving at a speed of %d\n", speed);
    }

    /**
     * Decrements the speed of the animal.
     *
     * @param dec The amount to decrement the speed by.
     */
    public void slowDown(int dec) {
        speed -= dec;

        System.out.printf("Speed is now %d\n", speed);
    }

    /**
     * Make a sound (Just prints random stuff)
     */
    public void makeSound() {
        System.out.println("Animal: \"grrr!\"");
    }
}

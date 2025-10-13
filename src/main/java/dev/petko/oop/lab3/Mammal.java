/**
 * @file Mammal.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Mammal class, without inheritance.
 */
public class Mammal {
    private String species;
    private int age, speed, legs;

    /**
     * Construct a new instance of {@link Mammal}
     *
     * @param species The species of the mammal.
     * @param age     The age of the mammal.
     * @param speed   The speed of the mammal.
     * @param legs    The amount of the legs the mammal has.
     */
    public Mammal(String species, int age, int speed, int legs) {
        setSpecies(species);
        setAge(age);
        setSpeed(speed);
        setLegs(legs);
    }

    /**
     * Gets the species of the mammal.
     *
     * @returns The species of the mammal.
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species of the mammal
     *
     * @param species The new species of the mammal.
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Gets the age of the mammal
     *
     * @returns The age of the mammal
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the mammal.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the speed of the mammal.
     *
     * @returns The speed of the mammal
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the mammal.
     *
     * @param speed The new speed of the mammal.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the number of legs on the mammal.
     *
     * @returns The number of legs on the animal.
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Sets the number of legs on the mammal.
     *
     * @param legs The new legs value.
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Increments the speed of the mammal.
     *
     * @param inc The amount to increment the speed by.
     */
    public void move(int inc) {
        speed += inc;

        System.out.printf("Moving at a speed of %d\n", speed);
    }

    /**
     * Decrements the speed of the mammal.
     *
     * @param dec The amount to decrement the speed by.
     */
    public void slowDown(int dec) {
        speed -= dec;

        System.out.printf("Speed is now %d\n", speed);
    }

    /**
     * {@inheritDoc Object::toString}
     */
    @Override
    public final String toString() {
        return String.format(
                "This mammal is a %s, %d years old, with %d speed and %d legs",
                getSpecies(), getAge(), getSpeed(), getLegs());
    }
}

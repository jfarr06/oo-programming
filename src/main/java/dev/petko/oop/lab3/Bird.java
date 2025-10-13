/**
 * @file Bird.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * A bird class without inheritance.
 */
public class Bird {
    private String species;
    private int age, speed;
    public Boolean canFly;

    /**
     * Construct a new instance of {@link Bird}
     *
     * @param species The species of the bird.
     * @param age     The age of the bird.
     * @param speed   The speed of the bird.
     * @param canFly  Can the bird fly?
     */
    public Bird(String species, int age, int speed, Boolean canFly) {
        setSpecies(species);
        setAge(age);
        setSpeed(speed);
        setCanFly(canFly);
    }

    /**
     * Gets the species of the bird.
     *
     * @returns The species of the bird.
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species of the bird
     *
     * @param species The new species of the bird.
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Gets the age of the bird
     *
     * @returns The age of the bird
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the bird.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the speed of the bird.
     *
     * @returns The speed of the bird
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the bird.
     *
     * @param speed The new speed of the bird.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets whether or not this bird can fly or not.
     *
     * @returns Whether or not this bird can fly.
     */
    public Boolean getCanFly() {
        return canFly;
    }

    /**
     * Sets whether or not this bird can fly.
     *
     * @param canFly [true] if can fly, [false] otherwise.
     */
    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    /**
     * Increments the speed of the {@link bird}
     *
     * @param inc The amount to increment the speed by.
     */
    public void move(int inc) {
        speed += inc;

        System.out.printf("Moving at a speed of %d\n", speed);
    }

    /**
     * Decrements the speed of the bird.
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
                "This bird is a %s, %d years old, with %d speed and can fly: %b",
                getSpecies(), getAge(), getSpeed(), getCanFly());
    }
}

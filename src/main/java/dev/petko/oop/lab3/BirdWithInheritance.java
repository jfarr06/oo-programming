/**
 * @file BirdWithInheritance.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Bird class with inheritance.
 *
 * Extends {@link Animal}
 */
public final class BirdWithInheritance extends Animal {
    public Boolean canFly;

    /**
     * Construct a new instance of {@link BirdWithInheritance}
     *
     * @param species The species of the bird.
     * @param age     The age of the bird.
     * @param speed   The speed of the bird.
     * @param canFly  Can the bird fly?
     */
    public BirdWithInheritance(String species, int age, int speed,
            Boolean canFly) {
        super(species, age, speed);

        setCanFly(canFly);
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
     * {@inheritDoc Animal::makeSound}
     */
    @Override
    public final void makeSound() {
        System.out.println("Bird: \"tweet tweet!\"");
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

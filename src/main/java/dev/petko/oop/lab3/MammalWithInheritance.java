/**
 * @file MammalWithInheritance.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab3;

/**
 * Mammal class with inheritance.
 *
 * Extends {@link Animal}
 */
public final class MammalWithInheritance extends Animal {
    private int legs;

    /**
     * Construct a new instance of {@link Mammal}
     *
     * @param species The species of the mammal.
     * @param age     The age of the mammal.
     * @param speed   The speed of the mammal.
     * @param legs    The amount of the legs the mammal has.
     */
    public MammalWithInheritance(String species, int age, int speed, int legs) {
        super(species, age, speed);

        setLegs(legs);
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
     * {@inheritDoc Animal::makeSound}
     */
    @Override
    public final void makeSound() {
        System.out.println("Mammal: \"growl!\"");
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

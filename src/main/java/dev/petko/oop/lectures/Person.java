/**
 * @file Person.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lectures;

import java.text.Format;

/**
 * Person class.
 */
public class Person
{
    private int _age;
    private String _name;

    /**
     * Construct a new instance of {@link Person}
     *
     * @param age The age of the person
     * @param name The name of the person.
     * @exception IllegalArgumentException Age must be between 1-100
     * @exception IllegalArgumentException Name cannot be null or empty!
     */
    public Person(int age, String name)
    {
        setAge(age);
        setName(name);
    }

    /**
     * Gets the age.
     *
     * @return The age.
     */
    public int getAge() 
    {
        return _age;
    }

    /**
     * Sets the age.
     *
     * @param age The new age.
     * @exception IllegalArgumentException Age must be between 1-100
     */
    public void setAge(int age) 
    {
        if (age < 1 || age > 100) throw new IllegalArgumentException("Age must be between 1-100");

        _age = age;
    }

    /**
     * Gets the name.
     *
     * @return The name.
     */
    public String getName() 
    {
        return _name;
    }

    /**
     * Sets the name.
     *
     * @param age The new name.
     * @exception IllegalArgumentException Name cannot be null or empty!
     */
    public void setName(String name) 
    {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty!");

        _name = name;
    }

    /**
     * {@inheritDoc Object::toString}
     */
    public String toString()
    {
        return String.format("[%d] %s", _age, _name);
    }
}

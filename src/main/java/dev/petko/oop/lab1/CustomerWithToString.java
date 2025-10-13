/**
 * @file CustomerWithToString.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab1;

/**
 * Basic customer class, with a toString method.
 */
public class CustomerWithToString {
    /**
     * The first name of the customer.
     */
    public String firstName;

    /**
     * The surname of the customer.
     */
    public String surname;

    /**
     * The city of the customer.
     */
    public String city;

    /**
     * The customer number of the customer.
     */
    public int customerNumber;

    /**
     * Construct a new instance of {@link CustomerWithToString}
     *
     * @param firstName      The first name of the customer.
     * @param surname        The surname of the customer.
     * @param city           The city of the customer.
     * @param customerNumber The customer number of the customer.
     */
    public CustomerWithToString(String firstName, String surname, String city,
            int customerNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.customerNumber = customerNumber;
    }

    /**
     * {@inheritDoc Object::toString}
     */
    @Override
    public final String toString() {
        return "This customer is called " + firstName + " " + surname +
                ", is from the city of " + city + ", and their customer id is " +
                customerNumber;
    }
}

/**
 * @file Customer.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab1;

/**
 * Basic customer class, without a ToString method.
 */
public class Customer {
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
     * Construct a new instance of {@link Customer}
     *
     * @param firstName The first name of the customer.
     * @param surname   The surname of the customer.
     * @param city      The city of the customer.
     */
    public Customer(String firstName, String surname, String city) {
        this(firstName, surname, city, 0);
    }

    /**
     * Construct a new instance of {@link Customer}
     *
     * @param firstName      The first name of the customer.
     * @param surname        The surname of the customer.
     * @param city           The city of the customer.
     * @param customerNumber The customer number of the customer.
     */
    public Customer(String firstName, String surname, String city,
            int customerNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.customerNumber = customerNumber;
    }
}

/*
 * @name: CustomerWithToString.java
 * @desc: Shared customer with a toString method.
 * @author: James Farrelly (C24402114)
 * */

package dev.petko.oop.lab1;

public class CustomerWithToString {
    public String firstName, surname, city;
    public int customerNumber;

    public CustomerWithToString(String firstName, String surname, String city, int customerNumber)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.customerNumber = customerNumber;
    }

    public String toString()
    {
        return "This customer is called " +
                firstName + " " + surname +
                ", is from the city of " + city +
                ", and their customer id is " + customerNumber;
                
    }
}

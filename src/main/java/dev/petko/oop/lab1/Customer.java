/*
 * @name: Customer.java
 * @desc: Shared customer class across problems.
 * @author: James Farrelly (C24402114)
 * */

package dev.petko.oop.lab1;

public class Customer
{
    public String firstName, surname, city;
    public int customerNumber;

    public Customer(String firstName, String surname, String city)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
    }

    public Customer(String firstName, String surname, String city, int customerNumber)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.customerNumber = customerNumber;
    }
}



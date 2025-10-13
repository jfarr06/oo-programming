/**
 * @file Employee.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab4;

/**
 * Base employee class.
 */
public class Employee {
    private static int gStaffNumber = 1000;

    private String firstName, surName;
    private int staffNumber;
    private double annualSalary;

    /**
     * Construct a new instance of {@link Employee}
     *
     * @param firstName    The first name of the employee.
     * @param surName      The surname of the employee.
     * @param annualSalary The annual salary of the employee.
     */
    public Employee(String firstName, String surName, double annualSalary) {
        staffNumber = gStaffNumber++;

        setFirstName(firstName);
        setSurName(surName);
        setAnnualSalary(annualSalary);
    }

    /**
     * Gets the firstname of this employee.
     *
     * @returns The first name of this employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of this employee.
     *
     * @param firstName The new first name of this employee.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the surname of this employee.
     *
     * @returns The surname of this employee.
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the surname of this employee.
     *
     * @param surName The new surname of the employee.
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * Get the staff number of the employee.
     *
     * @readonly
     * @returns The staff number of the employee.
     */
    public int getStaffNumber() {
        return staffNumber;
    }

    /**
     * Gets the annual salary of the employee.
     *
     * @returns The annial salary of the employee.
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Sets the annual salary of the employee.
     *
     * @param annualSalary The new annual salary of the employee.
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Calculates the pay of the employee.
     *
     * @returns The annual salaray per month.
     */
    public double calculatePay() {
        return annualSalary / 12;
    }

    /**
     * Calculates the pay of the employee with tax taken into account.
     *
     * @returns The pay with tax added.
     */
    public double calculatePay(double tax) {
        return calculatePay() + tax;
    }

    /**
     * {@inheritDoc Object::toString}
     */
    @Override
    public final String toString() {
        return String.format("%s %s (%d) €%f", getFirstName(), getSurName(),
                getStaffNumber(), getAnnualSalary());
    }
}

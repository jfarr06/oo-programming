/**
 * @file SalesEmployee.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab4;

/**
 * Implementation of {@link Employee} that
 * takes a sale commission into account.
 */
public final class SalesEmployee extends Employee {
    private double commissionEarned;

    /**
     * Construct a new instance of {@link SalesEmployee}
     *
     * @param firstName        The first name of the employee.
     * @param surName          The surname of the employee.
     * @param annualSalary     The annual salary of the employee.
     * @param commissionEarned The total commission earned of this employee.
     */
    public SalesEmployee(String firstName, String surName, double annualSalary,
            double commissionEarned) {
        super(firstName, surName, commissionEarned);

        setCommissionEarned(commissionEarned);
    }

    /**
     * Gets the commission earned of this employee.
     *
     * @returns The commission earned for this employee.
     */
    public double getCommissionEarned() {
        return commissionEarned;
    }

    /**
     * Sets the commission earned for this employee.
     *
     * @param commissionEarned The new commission earned for this employee.
     */
    public void setCommissionEarned(double commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    /**
     * Difference between this and {@link Employee::calculatePay}
     * is that it adds the commission that was earned as well.
     * <br/>
     * <br/>
     *
     * {@inheritDoc Employee::calculatePay}
     */
    @Override
    public final double calculatePay() {
        return super.calculatePay() + commissionEarned;
    }
}

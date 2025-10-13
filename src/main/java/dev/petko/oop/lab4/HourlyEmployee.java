/**
 * @file HourlyEmployee.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.lab4;

/**
 * Implementation of {@link Employee} that
 * does hourly work.
 */
public final class HourlyEmployee extends Employee {
    private double hoursWorked, hourlyRate;

    /**
     * Construct a new instance of {@link HourlyEmployee}
     *
     * @param firstName   The first name of the employee.
     * @param surName     The surname of the employee.
     * @param hoursWorked The number of hours this employee has worked.
     * @param hourlyRate  The hourly rate of this employee.
     */
    public HourlyEmployee(String firstName, String surName, double hoursWorked,
            double hourlyRate) {
        super(firstName, surName, 0);

        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    /**
     * Gets the hours worked by this employee.
     *
     * @returns The hours worked by this employee.
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets the hours worked by this employee.
     *
     * @param hoursWorked The new hours worked by this employee.
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Gets the hourly rate of this employee.
     *
     * @returns The hourly rate of this employee.
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the hourly rate of this emplyee.
     *
     * @param hourlyRate The new hourly rate of this employee.
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Difference between this and {@link Employee::calculatePay}
     * is this takes hours worked and hourly rate into account.
     * <br/>
     * <br/>
     *
     * {@inheritDoc Employee::calculatePay}
     */
    @Override
    public final double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

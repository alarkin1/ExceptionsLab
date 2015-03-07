package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static int maxVacationDays = 28;
    public static int minVacationDays = 0;
    public static int maxNameLength = 15;
    public static int minNameLength = 1;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    //must consult business to see if max or min vacation days change
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation > maxVacationDays || daysVacation < minVacationDays) {
            throw new IllegalArgumentException("Invalid number of vacation days entered!");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    //consult employer on wether or not to allow numbers in name? Ask employer about the min and max length of first and last name? Would be nice to have a method that loops through illegal characters.  Ask if employer wants to allow nulls
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() || firstName.length() < minNameLength || firstName.length() > maxNameLength) {
            throw new IllegalArgumentException("Invalid first name has been entered");
        }
        this.firstName = firstName;
    }

    public final Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    //Sanitize data if employeer allows.  there is some very extensive validation of ssn numbers.  I found multiple invalid cases of ssns on wikipedia
    public final void setSsn(String ssn) {
        char[] brokenUpSSN = ssn.toCharArray();
        if (ssn == null || ssn.isEmpty() || ssn.length() != 9) {

        }

        this.ssn = ssn;
    }

}

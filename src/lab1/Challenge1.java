package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        try {
            Challenge1 app = new Challenge1();

            String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (RuntimeException re) {
            //use appropriate output class and method
            JOptionPane.showMessageDialog(null, re.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }

    //Ask employer if the firstname or lastname can have a number
    public final String extractLastName(String fullName) throws RuntimeException {
        String[] nameParts = fullName.split(" ");
        
        if (fullName == null) {
            throw new NullPointerException("Name has not been entered");
        }else if (fullName.isEmpty() || nameParts.length < 2 || nameParts.length > 4) {
            throw new IllegalArgumentException("You have not entered a valid first name last name combination!");
        } 
        return nameParts[nameParts.length - 1];
    }

}

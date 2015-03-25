package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {

        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        try {
            lastName = nameService.fullNameValidator(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (RuntimeException re) {
            //output to the appropriate output class
            JOptionPane.showMessageDialog(null, re.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
            startConversation();
        }
    }

}

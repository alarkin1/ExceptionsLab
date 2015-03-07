package lab2;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = -1;
    private static int minFirstNameLength = 1;
    private static int maxFirstNameLength = 15;
    private static int minLastNameLength = 1;
    private static int maxLastNameLength = 17;

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    private String extractLastName(String fullName) throws IllegalArgumentException {
        String[] nameParts = fullName.split(" ");
        if (nameParts[0].length() > maxLastNameLength || nameParts[0].length() < minLastNameLength) {
            throw new IllegalArgumentException("Invalid last name has been entered!");
        }
        return nameParts[nameParts.length - 1];
    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    private String extractFirstName(String fullName) throws IllegalArgumentException {
        String[] nameParts = fullName.split(" ");
        if (nameParts[0].length() > maxFirstNameLength || nameParts[0].length() < minFirstNameLength) {
            throw new IllegalArgumentException("Invalid first name has been entered!");
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public final int getNameLength(String name) {
        return name.length();
    }

    //determine min and max for first name and last name from employer.  Ask employer if we should allow nulls.  Ask employer if we should allow numbers
    public String[] fullNameValidator(String fullName) throws IllegalArgumentException {
        String[] nameParts = fullName.split(" ");
        String[] twoPartFullName = new String[2];
        char[] individualChars = fullName.toCharArray();
        for (char individualChar : individualChars) {
            if (Character.isDigit(individualChar)) {
                throw new IllegalArgumentException("You can not have numbers in your fisrt name or last name");
            }
        }
        if (fullName == null || fullName.isEmpty() || fullName.indexOf("-") != -1 || nameParts.length < 2) {
            throw new IllegalArgumentException("You have entered an invalid first name or you have entered an invalid last name!");
        }
        twoPartFullName[0] = extractFirstName(fullName);
        twoPartFullName[1] = extractLastName(fullName);
        return nameParts;
    }

}

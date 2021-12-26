import java.util.InputMismatchException;

/**
 * @author Massimo
 * String reverse
 */
public class ReverseString {

    /**
     * Method for reversing String via loop
     * @param input given String
     * @return reversed String
     */
    public String reverseStringWithRegularLoop(String input) {
        if (checkIfStringIsOk(input)) {
            throw new InputMismatchException("Input can't be null or empty");
        }

        //immutable object, while regular String is immutable
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0 ; i--) {
            output.append(input.charAt(i));
        }

        return output.toString();
    }

    /**
     * Method for reversing String via recursion
     * @param input given String
     * @return reversed String
     */
    public String reverseStringWithRecursion(String input) {
        if (checkIfStringIsOk(input)) {
            return input;
        }

        return reverseStringWithRecursion(input.substring(1)) + input.charAt(0);
    }

    /**
     * Checker method if String is null or less size than 2 character
     * @param input given String
     * @return true if its null or less than 2
     */
    public boolean checkIfStringIsOk(String input) {
        return input == null || input.length() <= 1;
    }
}
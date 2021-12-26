import java.util.InputMismatchException;

/**
 * Pattern recognition
 */
public class PatternRecognition {

    /**
     Method to verify value and pattern and find equality
     * @param value given input
     * @param pattern given pattern to match
     * @return true if input matches the pattern, false otherwise
     */
    public boolean verifyStringPattern(String value, String pattern) {

        //String pattern may contain only 1 wildcard "*"

        if (value == null || pattern == null) {
            throw new InputMismatchException("Value or pattern is null");
        }

        if (!pattern.contains("*")) {
            return value.equals(pattern);
        }

        //returns true only if both cases are matched
        return (doesFirstCharactersMatchUntilWildcard(value, pattern) && doesLastCharactersMatchFromWildcard(value, pattern));
    }

    /**
     * Method to loop through last characters of pattern until (*) and check if the value ends with the same
     * @param value given input
     * @param pattern given pattern
     * @return true if last characters are matched, false otherwise
     */
    public boolean doesLastCharactersMatchFromWildcard(String value, String pattern) {
        int i = 1;
        StringBuilder stringBuilder = new StringBuilder();

        //loop until (*) occurs
        while (true) {
            //starting from last character
            String c = String.valueOf(pattern.charAt(pattern.length() - i));
            if (c.equals("*")) break;
            stringBuilder.append(c);
            i++;
        }

        return value.endsWith(stringBuilder.reverse().toString());
    }

    /**
     * Method to loop through first characters of pattern until (*) and check if the value starts with the same
     * @param value given input
     * @param pattern given pattern
     * @return true if first characters are matched, false otherwise
     */
    public boolean doesFirstCharactersMatchUntilWildcard(String value, String pattern) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();

        //loop until (*) occurs
        while (true) {
            //starting from first character
            String c = String.valueOf(pattern.charAt(i));
            if (c.equals("*")) break;
            stringBuilder.append(c);
            i++;
        }

        return value.startsWith(stringBuilder.toString());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    private ReverseString reverseString;

    @Before
    public void init() {
        reverseString = new ReverseString();
    }

    @Test
    public void reverseStringWithRegularLoop() {
        String input = "bbaa";
        String input1 = "ab ab";
        String input2 = "massimo";
        String input3 = "";

        assertEquals("aabb", reverseString.reverseStringWithRegularLoop(input));
        assertEquals("ba ba", reverseString.reverseStringWithRegularLoop(input1));
        assertEquals("omissam", reverseString.reverseStringWithRegularLoop(input2));
        assertEquals("", reverseString.reverseStringWithRegularLoop(input3));
        assertNull(reverseString.reverseStringWithRegularLoop(null));
    }

    @Test
    public void reverseStringWithRecursion() {
        String input = "bbaa";
        String input1 = "ab ab";
        String input2 = "massimo";
        String input3 = "";

        assertEquals("aabb", reverseString.reverseStringWithRecursion(input));
        assertEquals("ba ba", reverseString.reverseStringWithRecursion(input1));
        assertEquals("omissam", reverseString.reverseStringWithRecursion(input2));
        assertEquals("", reverseString.reverseStringWithRecursion(input3));
        assertNull(reverseString.reverseStringWithRecursion(null));

    }
}

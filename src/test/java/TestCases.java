import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    private ReverseString reverseString;
    private BuildTriangle buildTriangle;

    @Before
    public void init() {
        reverseString = new ReverseString();
        buildTriangle = new BuildTriangle();
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

    @Test
    public void printTriangle() {
        System.out.println(buildTriangle.printTriangle(7));

        System.out.println(buildTriangle.printTriangle(-7));

        System.out.println(buildTriangle.printTriangle(0));
    }
}

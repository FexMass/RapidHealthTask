import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

/**
 * @author Massimo
 */
public class TestCases {

    private ReverseString reverseString;
    private BuildTriangle buildTriangle;
    private FindTriangleSize findTriangleSize;

    @Before
    public void init() {
        reverseString = new ReverseString();
        buildTriangle = new BuildTriangle();
        findTriangleSize = new FindTriangleSize();
    }

    @Test
    public void reverseStringWithRegularLoop() {
        String input = "bbaa";
        String input1 = "ab ab";
        String input2 = "massimo";

        assertEquals("aabb", reverseString.reverseStringWithRegularLoop(input));
        assertEquals("ba ba", reverseString.reverseStringWithRegularLoop(input1));
        assertEquals("omissam", reverseString.reverseStringWithRegularLoop(input2));
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

    @Test
    public void findTriangleSize() {
        String trianglePattern1 =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******";
        String trianglePattern2 =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n";

        String trianglePattern3 = "*\n";

        String trianglePattern4 =
                "**\n" +
                        "*\n";

        String trianglePattern5 =
                "******\n" +
                        "*****\n" +
                        "****\n" +
                        "***\n" +
                        "**\n" +
                        "*\n";

        assertEquals(7, findTriangleSize.findTriangleSize(trianglePattern1));
        assertEquals(4, findTriangleSize.findTriangleSize(trianglePattern2));
        assertEquals(1, findTriangleSize.findTriangleSize(trianglePattern3));
        assertEquals(-2, findTriangleSize.findTriangleSize(trianglePattern4));
        assertEquals(-6, findTriangleSize.findTriangleSize(trianglePattern5));
    }

    @Test(expected = InputMismatchException.class)
    public void findTriangleSize_should_throw_exception() {
        reverseString.reverseStringWithRegularLoop(null);
        reverseString.reverseStringWithRegularLoop("");
        reverseString.reverseStringWithRecursion(null);
        reverseString.reverseStringWithRecursion("");
        findTriangleSize.findTriangleSize("");
        findTriangleSize.findTriangleSize(null);
    }
}

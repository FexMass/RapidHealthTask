/**
 * Print asterisk (*) triangle
 */
public class BuildTriangle {

    /**
     * Method for checking input size and printing normal or inverted triangle
     * @param size given size
     * @return inverted or normal triangle
     */
    public String printTriangle(int size) {

        if (size == 0) {
            return "Size is zero!";
        }

        if (size < 0) {
            return printTriangleInverted(Math.abs(size));
        } else {
            return printTriangleNormal(size);
        }
    }

    /**
     * Method to fill string builder with triangle pattern for its size in normal direction
     * @param size given size
     * @return string object
     */
    public String printTriangleNormal(int size) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            result.append("*".repeat(Math.max(0, i)));
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    /**
     * Method for filling string builder with triangle pattern for its size in inverted direction
     * @param size given size
     * @return string object
     */
    public String printTriangleInverted(int size) {
        StringBuilder result = new StringBuilder();

        for (int i = size; i >= 1; i--) {
            result.append("*".repeat(i));
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
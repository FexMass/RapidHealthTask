import java.util.InputMismatchException;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Massimo
 * Find triangle size in given asterisk pattern input
 */
public class FindTriangleSize {

    /**
     * Method for counting size (levels) of triangle (negative and positive)
     * @param input given String pattern
     * @return size of triangle
     */
    public int findTriangleSize(String input) {
        if (input == null) {
            throw new InputMismatchException("String is null");
        }

        String value = input.strip();

        if (value.isEmpty()) {
            throw new InputMismatchException("String can't be empty");
        }

        Supplier<Stream<String>> streamSupplier = input::lines;

        Optional<String> lengthOfFirstString = streamSupplier.get().findFirst();

        if (lengthOfFirstString.isPresent() && lengthOfFirstString.get().length() > 1) {
            //(-) for converting to negative value
            return -(int) streamSupplier.get().count();
        }
        return (int) streamSupplier.get().count();
    }
}
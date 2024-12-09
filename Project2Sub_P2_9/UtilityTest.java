import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Utility class.
 */
class UtilityTest {

    /**
     * Tests the getEvenNumbers method for various cases.
     */
    @Test
    void testGetEvenNumbers() {
        // Test with a mix of even and odd numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, Utility.getEvenNumbers(numbers));

        // Test with only odd numbers
        assertEquals(List.of(), Utility.getEvenNumbers(Arrays.asList(1, 3, 5)));

        // Test with null input
        assertEquals(List.of(), Utility.getEvenNumbers(null));
    }

    /**
     * Tests the toUpperCase method for various cases.
     */
    @Test
    void testToUpperCase() {
        // Test normal cases
        assertEquals("HELLO", Utility.toUpperCase("hello"));
        assertEquals("JAVA", Utility.toUpperCase("JaVa"));

        // Test with null input
        assertNull(Utility.toUpperCase(null));
    }

    /**
     * Tests the getLongestString method for various cases.
     */
    @Test
    void testGetLongestString() {
        // Test with a normal list of strings
        List<String> strings = Arrays.asList("short", "medium", "longest");
        assertEquals("longest", Utility.getLongestString(strings));

        // Test with null input
        assertNull(Utility.getLongestString(null));

        // Test with an empty list
        assertNull(Utility.getLongestString(List.of()));

        // Test with a list containing multiple longest strings
        List<String> ties = Arrays.asList("equal", "other");
        assertEquals("equal", Utility.getLongestString(ties));
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A utility class containing methods for common operations such as retrieving even numbers,
 * converting strings to uppercase, and finding the longest string in a list.
 */
public class Utility {

    public static void main(String[] args) {
        // Test getEvenNumbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers: " + getEvenNumbers(numbers));

        // Test toUpperCase
        String input = "hello world";
        System.out.println("Uppercase: " + toUpperCase(input));

        // Test getLongestString
        List<String> strings = Arrays.asList("short", "medium", "longest");
        System.out.println("Longest string: " + getLongestString(strings));
    }

    /**
     * Returns all even numbers from the given list of integers.
     * 
     * @param numbers the list of integers. May contain null values.
     * @return a list of even integers, or an empty list if none exist or input is null.
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        if (numbers != null) {
            for (Integer num : numbers) {
                if (num != null && num % 2 == 0) {
                    evens.add(num);
                }
            }
        }
        return evens;
    }

    /**
     * Converts all characters in the given string to uppercase.
     * 
     * @param input the input string.
     * @return the upper-case version of the input string, or null if input is null.
     */
    public static String toUpperCase(String input) {
        return (input == null) ? null : input.toUpperCase();
    }

    /**
     * Returns the longest string from the given list of strings.
     * 
     * @param strings the list of strings. May contain null values.
     * @return the longest string in the list, or null if the list is null or empty.
     */
    public static String getLongestString(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return null;
        }
        String longest = "";
        for (String str : strings) {
            if (str != null && str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}

public class CharUpperCase {
    /**
     * Converts all characters in the given string to uppercase.
     *
     * @param input The string to be converted to uppercase.
     * @return A new string with all characters converted to uppercase.
     * @throws IllegalArgumentException if the input string is null.
     */
    public static String toUpperCase(String input){
        if (input == null){
            throw new IllegalArgumentException("Input string cannot be null");

        }
        return input.toUpperCase();
    }
}
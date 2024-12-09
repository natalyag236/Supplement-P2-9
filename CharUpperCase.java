public class CharUpperCase {

    public static String toUpperCase(String input){
        if (input == null){
            throw new IllegalArgumentException("Input string cannot be null");

        }
        return input.toUpperCase();
    }
}
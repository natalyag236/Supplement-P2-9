import java.util.*;

public class LongestString {
    /**
     * Finds and returns the longest string from the provided list of strings.
     *
     * @param strings The list of strings to search.
     * @return The longest string in the list. If multiple strings have the same maximum length, the first one is returned.
     *         Returns null if the list is null or empty.
     */
    public static String findLongestString(List<String> strings) {
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


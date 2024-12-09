import java.util.*;

public class LongestString {
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


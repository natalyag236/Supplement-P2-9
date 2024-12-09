import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class LongestStringTest {

    @Test
    public void testFindLongestString() {
        List<String> input = Arrays.asList("money", "nike", "jordans", "gemini");
        String expected = "jordans";
        String result = LongestString.findLongestString(input);
        assertEquals(expected, result, "The longest string should be 'jordans'");
    }

}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class CharUpperCaseTest {
    @Test
     public void testToUpperCase() {
        String input = "ce noir";
        String expected = "CE NOIR";
        String result = CharUpperCase.toUpperCase(input);
        assertEquals("The string should be converted to uppercase", expected, result);
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

public class CharUpperCaseTest {
    @Test
     public void testToUpperCase() {
        String input = "ce noir";
        String expected = "CE NOIR";
        String result = StringUtils.toUpperCase(input);
        assertEquals("The string should be converted to uppercase", expected, result);
    }
}

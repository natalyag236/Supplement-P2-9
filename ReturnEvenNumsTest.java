import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class ReturnEvenNumsTest {

    @Test
    public void testGetEvenNums() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> result = ReturnEvenNums.getEvenNums(numbers);
        assertEquals(expected, result); 
    }
}
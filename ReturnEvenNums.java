import java.util.ArrayList;
import java.util.List;

public class ReturnEvenNums {
    /**
     * Filters and returns a list of even numbers from the provided list.
     *
     * @param numbers The list of integers to filter.
     * @return A list containing only the even numbers from the input list.
     */

     public static List<Integer> getEvenNums(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}

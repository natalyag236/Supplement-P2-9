import java.util.ArrayList;
import java.util.List;

public class ReturnEvenNums {
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

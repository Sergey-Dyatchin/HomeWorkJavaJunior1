import java.util.Arrays;
import java.util.List;


public class ProcessingNumbers {
    private ProcessingNumbers(){

    }

    public static double averageOfEven (int [] numbers) {
        return Arrays.stream(numbers).filter(num -> num % 2 == 0).average().getAsDouble();

    }

    public static double averageOfEven (List<Integer> numbers) {
        return numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).average().getAsDouble();
    }
}

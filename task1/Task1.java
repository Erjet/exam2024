import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 7, 3, 4, 1, 1, 8, 3, 7, 10);
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
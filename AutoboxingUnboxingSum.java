import java.util.*;

public class AutoboxingUnboxingSum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }
        scanner.close();
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}

package Java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // reduce without identity
        Optional<Integer> sum = list1.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());

        // reduce with identity
        Integer sum1 = list1.stream().reduce(5, (a, b) -> a + b);
        System.out.println(sum1);

        // reduce with accumulator and combinator
        int totalSum = list1.parallelStream()
                .reduce(0, (partialSum, num) -> partialSum + num);
        System.out.println("Total Sum is: " + totalSum);

        // sum
        int sum2 = list1.stream().mapToInt(x -> x).sum();
        System.out.println("Total Sum is: " + sum2);

        // max
        Optional<Integer> max = list1.stream().max(Comparator.naturalOrder());
        System.out.println("Max is: " + max.get());

        // min
        Optional<Integer> min = list1.stream().min(Comparator.naturalOrder());
        System.out.println("Min is: " + min.get());
    }
}

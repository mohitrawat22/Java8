package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class AggregationOperations {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("abc1");
        list1.add("def23");
        list1.add("ghi456");
        list1.add("jk7");
        list1.add("mn");
        Long count = list1.stream().collect(Collectors.counting());
        System.out.println(count);

        int sum = list1.stream().collect(Collectors.summingInt(x -> x.length()));
        System.out.println(sum);

        double average = list1.stream().collect(Collectors.averagingInt(x -> x.length()));
        System.out.println(average);

        Optional<String> min = list1.stream().collect(Collectors.minBy(Comparator.comparing(x -> x.length())));
        System.out.println(min.get());

        Optional<String> max = list1.stream().collect(Collectors.maxBy(Comparator.comparing(x -> x.length())));
        System.out.println(max.get());

        IntSummaryStatistics iss = list1.stream().collect(Collectors.summarizingInt(x -> x.length()));
        System.out.println(iss);

        String joinedString = list1.stream().collect(Collectors.joining());
        System.out.println(joinedString);

        String joinedString1 = list1.stream().collect(Collectors.joining(" "));
        System.out.println(joinedString1);

        String joinedString2 =
                list1.stream().collect(Collectors.joining(" ", "prefix ", " suffix"));
        System.out.println(joinedString2);
    }
}

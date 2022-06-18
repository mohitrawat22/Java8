package Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperations {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");

        Optional<String> first = list1.parallelStream().filter(x -> x.length() == 1).findFirst();
        System.out.println(first.get());

        Optional<String> any = list1.parallelStream().filter(x -> x.length() == 1).findAny();
        System.out.println(any.get());
    }
}

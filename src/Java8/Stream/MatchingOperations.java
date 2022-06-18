package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class MatchingOperations {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");

        List<String> list2 = new ArrayList<>();

        System.out.println("anyMatch ...");
        System.out.println(list1.stream().anyMatch(x -> x.equals("a")));
        System.out.println(list1.stream().anyMatch(x -> x.equals("t")));
        System.out.println(list2.stream().anyMatch(x -> x.equals("a")));

        System.out.println("allMatch ...");
        System.out.println(list1.stream().allMatch(x -> x.length() == 1));
        System.out.println(list1.stream().allMatch(x -> x.equals("t")));
        System.out.println(list2.stream().allMatch(x -> x.equals("a")));

        System.out.println("noneMatch ...");
        System.out.println(list1.stream().noneMatch(x -> x.equals("a")));
        System.out.println(list1.stream().noneMatch(x -> x.equals("t")));
        System.out.println(list2.stream().noneMatch(x -> x.equals("a")));
    }
}

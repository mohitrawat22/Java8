package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class SlicingMethods {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("India");
        list1.add("India");
        list1.add("India1");
        list1.add("India2");
        list1.add("India2");
        list1.add("India");

        list1.stream().distinct().forEach(x -> System.out.print(x+" "));
        System.out.println();
        list1.stream().limit(4).forEach(x -> System.out.print(x+" "));
        System.out.println();
        list1.stream().skip(3).forEach(x -> System.out.print(x+" "));
    }
}

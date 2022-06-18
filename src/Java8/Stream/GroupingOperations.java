package Java8.Stream;

import Java8.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingOperations {
    public static void main(String[] args) {
        List<String> list5 = new ArrayList<>();
        list5.add("abc");
        list5.add("def6");
        list5.add("mno45");
        list5.add("xyz123");
        list5.add("xyz123");

        Map<Integer, List<String>> map1 = list5.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(map1);

        Map<Integer, Set<String>> set1 =
                list5.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.toSet()));
        System.out.println(set1);

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "M1", 20, "India"));
        list.add(new Employee(2, "M2", 20, "India"));
        list.add(new Employee(3, "M3", 21, "USA"));
        list.add(new Employee(3, "M3", 22, "USA"));
        list.add(new Employee(4, "M4", 22, "Russia"));

        Map<String, Map<Integer, List<Employee>>> map =
                list.stream().collect(
                        Collectors.groupingBy(
                                e -> e.getCountry(),
                                Collectors.groupingBy(e -> e.getAge())
                        )
                );
        System.out.println(map);

        Map<String, Integer> map2 =
                list.stream().collect(
                        Collectors.groupingBy(
                                e -> e.getCountry(),
                                Collectors.summingInt(x -> x.getAge())
                        )
                );
        System.out.println(map2);

        Map<String, Optional<Employee>> map3 = list.stream().collect(
                Collectors.groupingBy(e -> e.getCountry(),
                        Collectors.maxBy(Comparator.comparingInt(e -> e.getAge()))
                ));
        System.out.println(map3);

        ConcurrentMap<String, List<Employee>> map4= list.parallelStream().collect(
                        Collectors.groupingByConcurrent(e -> e.getCountry()));
        System.out.println(map4);


        // partitioningBy
        Map<Boolean, List<Employee>> map5 =
                list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 20));
        System.out.println(map5);


    }
}

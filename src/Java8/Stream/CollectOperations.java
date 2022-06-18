package Java8.Stream;

import Java8.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CollectOperations {
    public static void main(String[] args) {
        Person person1 = new Person(10);
        Person person2 = new Person(11);
        Person person3 = new Person(12);
        Person person4 = new Person(13);
        Person person5 = new Person(13);

        List<Person> list1 = new ArrayList<>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);

        List<Integer> list2 = new ArrayList<>();
        list2 = list1.stream().map(p -> p.age).collect(Collectors.toList());
        System.out.println(list2);

        Set<Integer> list3 = list1.stream().map(p -> p.age).collect(Collectors.toSet());
        System.out.println(list3);

        LinkedList<Integer> list4 =
                list1.stream().map(p -> p.age).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list4);

        List<String> list5 = new ArrayList<>();
        list5.add("abc");
        list5.add("def6");
        list5.add("mno45");
        list5.add("xyz123");
        list5.add("xyz123");

        //Map<String, Integer> map1 = list5.stream().collect(Collectors.toMap(s -> s, b -> b.length()));
        //System.out.println(map1);

        Map<String, Integer> map1 =
                list5.stream().collect(Collectors.toMap(s -> s, b -> b.length(), (s1, s2) -> s1));
        System.out.println(map1);

        List<String> reverse = list5.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        l -> {
                            Collections.reverse(l);
                            return l.stream();
                        }
                )).collect(Collectors.toList());
        System.out.println(reverse);
    }
}

package Java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a", "b"));
        list.add(Arrays.asList("c", "d"));
        list.add(Arrays.asList("e", "f"));
        list.add(Arrays.asList("g", "h"));

        Stream<List<String>> stream1 = list.stream();
        Stream<List<String>> stream2 =
                stream1.filter(x -> {
                    // here x is list for example: [a,b] , [c,d] etc.
                    // so we need to flatten all the lists, because below filter will return nothing
                    return "a".equals(x.toString());
                });
        stream2.forEach(System.out::println);

        Stream<List<String>> stream3 = list.stream();
        Stream<String> stream4 = stream3.flatMap(s -> s.stream());
        Stream<String> stream5 = stream4.filter(x -> "a".equals(x.toString()));
        stream5.forEach(System.out::println);

        List<String> l1 = new ArrayList<>();
        l1.add("mohit");
        l1.add("rawat");
        l1.stream().flatMapToInt(x -> IntStream.of(x.length())).forEach(System.out::println);
    }
}

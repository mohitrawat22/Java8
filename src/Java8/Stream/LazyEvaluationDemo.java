package Java8.Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        Optional<Integer> element = Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(x -> {
                    System.out.println("Greater than 3: "+x);
                    return x > 3;
                })
                .filter(x -> {
                    System.out.println("Divisible by 3: "+x);
                    return x % 3 == 0;
                })
                .findFirst();

    }
}

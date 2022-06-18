package Java8.FunctioanlInterfaces.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func1 = (x, y) -> x + y;
        int result = func1.apply(2, 3);
        System.out.println(result);
    }
}

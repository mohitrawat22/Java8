package Java8.FunctioanlInterfaces.Function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, Integer> lenFunc = str -> str.length();
        int len = lenFunc.apply("Hello");
        System.out.println(len);

        // compose: func1.compose(func2)
        // func2 will execute first then func1

        Function<Integer, Integer> func1 = x -> x + 1;
        Function<Integer, Integer> func2 = y -> y * 4;
        int result = func1.compose(func2).apply(2);
        System.out.println(result);

        // andThen: func1.andThen(func2)
        // func1 will execute first then func2
        int result1 = func1.andThen(func2).apply(2);
        System.out.println(result1);
    }
}

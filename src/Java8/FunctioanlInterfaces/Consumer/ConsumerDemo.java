package Java8.FunctioanlInterfaces.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c1 = (String str) -> System.out.println(str);
        c1.accept("Hello");

        // andThe is used for chaining
        Consumer<String> c2 = (String str) -> System.out.println(str);
        c2.accept("World");

        System.out.println("======");

        c1.andThen(c2).accept("Hello");
    }
}

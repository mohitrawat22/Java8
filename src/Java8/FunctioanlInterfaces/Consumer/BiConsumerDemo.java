package Java8.FunctioanlInterfaces.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String, String> biconsumer = (String s1, String s2) -> System.out.println(s1 + " "+s2);
        biconsumer.accept("Hello", "World");
    }
}

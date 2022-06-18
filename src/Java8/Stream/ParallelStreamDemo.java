package Java8.Stream;

import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .forEach(x ->
                {
                    System.out.print("Element: "+x + ", Thread: "+Thread.currentThread().getName());
                    System.out.println();
                });
        System.out.println("===============");
        Stream.of(1,2,3,4,5,6,7,8,9)
                .parallel()
                .forEach(x ->
                {
                    System.out.print("Element: "+x + ", Thread: "+Thread.currentThread().getName());
                    System.out.println();
                });
    }
}

package Java8.LambdaExpressions;

public class WellWisher {

    public static void wish(Greeting greet) {
        greet.greet();
    }

    public static void main(String[] args) {
        wish(() -> System.out.println("Hello"));
    }
}

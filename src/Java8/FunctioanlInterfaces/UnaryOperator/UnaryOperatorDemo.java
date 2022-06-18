package Java8.FunctioanlInterfaces.UnaryOperator;

import Java8.Person;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        Person person = new Person();
        UnaryOperator<Person> unary = p -> {
            p.age = 10;
            return p;
        };
        unary.apply(person);
        System.out.println(person.age);

        // IntUnaryOperator
        IntUnaryOperator intunary = num -> num * 2;
        int result = intunary.applyAsInt(3);
        System.out.println(result);
    }
}

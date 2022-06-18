package Java8.FunctioanlInterfaces.Supplier;

import Java8.Person;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Person> sup = () -> new Person(19);
        Predicate<Person> pred = p -> p.age > 18;

        boolean result = isPersonEligible(pred, sup);
        System.out.println(result);
    }

    public static boolean isPersonEligible(Predicate p, Supplier s) {
        return p.test(s.get());
    }
}

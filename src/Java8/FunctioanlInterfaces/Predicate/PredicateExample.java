package Java8.FunctioanlInterfaces.Predicate;

import Java8.Person;

import java.util.function.Predicate;

public class PredicateExample {

    public static boolean isPersonValid(Person p, Predicate<Person> predicate) {
        return predicate.test(p);
    }

    public static void main(String[] args) {

        Person person = new Person(18);
        Predicate<Person> predicate = p -> p.age >= 18;

        System.out.println(isPersonValid(person, predicate));
    }
}


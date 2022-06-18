package Java8.FunctioanlInterfaces.Predicate;

import Java8.Person;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static boolean isPersonValid(Person p, Integer age, BiPredicate<Person, Integer> biPredicate) {
        return biPredicate.test(p, age);
    }

    public static void main(String[] args) {
        Person p = new Person(20);
        boolean result = isPersonValid(p, 18, (person, minAge) -> person.age > minAge);
        System.out.println(result);
    }
}

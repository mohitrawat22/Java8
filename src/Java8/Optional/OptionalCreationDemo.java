package Java8.Optional;

import Java8.Person;

import java.util.Optional;

public class OptionalCreationDemo {
    public static void main(String[] args) {
        Person person = null;

        // throws NPE because we are creating optional based on an object which is NULL
        // Optional<Person> person1 = Optional.of(person);

        // if you want to create an optional based on an object which is NULL
        Optional<Person> person2 = Optional.ofNullable(person);
        System.out.println(person2);
    }
}

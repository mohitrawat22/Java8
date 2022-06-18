package Java8.Optional;

import Java8.Person;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) throws Exception {
        Person person = new Person(10);
        Optional<Person> person1 = Optional.ofNullable(person);

        // isPresent
        if(person1.isPresent()) {

            // get
            Person person2 = person1.get();
        }

        // ifPresent
        person1.ifPresent(System.out::println);

        Person person3 = null;
        Optional<Person> person4 = Optional.ofNullable(person3);

        // orElse
        System.out.println(person4.orElse(new Person(20)));

        // orElseGet
        Optional<Person> person5 = Optional.ofNullable(person3);
        System.out.println(person5.orElseGet(() -> new Person(30)));

        person5 = Optional.ofNullable(person3);
        // orElseThrow
        //person5.orElseThrow(() -> new Exception("Exception"));
    }
}

package Java8.LambdaExpressions1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1,"MOHIT4"));
        persons.add(new Person(4,"MOHIT3"));
        persons.add(new Person(3,"MOHIT2"));
        persons.add(new Person(2,"MOHIT1"));

        System.out.println(persons);
        persons = PersonService.getSortedPersons(persons);
        System.out.println(persons);
    }
}

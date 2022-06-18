package Java8.LambdaExpressions1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {
    public static List<Person> getSortedPersons(List<Person> persons) {

        Collections.sort(persons, (Person i, Person j) -> i.getName().compareTo(j.getName()));
        return persons;

    }
}
